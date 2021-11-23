public static java.lang.String getDepth(java.lang.String symbol) throws java.lang.Exception {
    return com.binance.BinanceAPI.sendGet(("/api/v1/depth?symbol=" + symbol));
}