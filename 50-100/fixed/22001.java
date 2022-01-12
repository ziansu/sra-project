public int findOptimalRevenue(final int[] prices) {
    if ((prices == null) || ((prices.length) == 0)) {
        return 0;
    }
    return findOptimalRevenue(prices.length, prices, new int[(prices.length) + 1], new int[prices.length]);
}