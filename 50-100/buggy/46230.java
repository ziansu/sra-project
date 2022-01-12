public void put(double amount) {
    double sum = (curSum) + ((decimals) / 100.0);
    sum += amount;
    curSum = ((int) (sum));
    decimals = ((int) ((sum - (curSum)) * 100));
}