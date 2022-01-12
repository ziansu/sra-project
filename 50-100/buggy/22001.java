public int findOptimalRevenue(final int[] prices) {
    if ((prices == null) || ((prices.length) == 0)) {
        return 0;
    }
    final int[] optimalRevenues = new int[(prices.length) + 1];
    return findOptimalRevenue(prices.length, prices, optimalRevenues);
}