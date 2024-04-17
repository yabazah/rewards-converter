public class RewardValue {
//    public static void main(String[] args){
//
//    }
    private final double cash;
    private double miles;

    public RewardValue(double cash){
        this.cash = cash;
    }

    public RewardValue(int miles){
        this.cash = convertToCash(miles);
    }

    private static double convertToCash(int miles){
        return (miles*0.0035);
    }

    private static int convertToMiles(double cash){
        return (int)(cash/0.0035);
    }

    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return convertToMiles(this.cash);
    }
}
