public void updateBKTickerData(data.BarKey bk, java.lang.String key, java.lang.Double value) {
    java.util.HashMap<java.lang.String, java.lang.Double> tickerDataHash = bkTickerDataHash.get(bk);
    if (tickerDataHash == null) {
        tickerDataHash = new java.util.HashMap<java.lang.String, java.lang.Double>();
    }
    tickerDataHash.put(key, value);
    bkTickerDataHash.put(bk, tickerDataHash);
}