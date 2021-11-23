public double[] getCashPrizes() {
    double[] arr = new double[8];
    for (java.lang.String path : configRewards.getKeys(false)) {
        int i = java.lang.Integer.parseInt(path.substring(11));
        double amount = configRewards.getDouble(("cash-prize_" + i));
        arr[i] = amount;
    }
    return arr;
}