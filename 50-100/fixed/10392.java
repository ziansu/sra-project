public void take(double amount) {
    double sum = (curSum) + ((decimals) / 100.0);
    sum -= amount;
    curSum = ((int) (sum));
    decimals = ((int) (java.lang.Math.round(((sum * 100) - ((curSum) * 100)))));
}