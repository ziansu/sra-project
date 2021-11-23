private yahoofinance.Stock getFromYahoo(java.lang.String ticker) throws java.io.IOException {
    boolean retry = true;
    yahoofinance.Stock stock = null;
    while (retry) {
        retry = false;
        try {
            stock = yahoofinance.YahooFinance.get(ticker);
        } catch (java.net.SocketTimeoutException | java.net.UnknownHostException e) {
            try {
                java.lang.Thread.sleep((3 * 1000));
            } catch (java.lang.InterruptedException ignore) {
            }
            retry = true;
        }
    } 
    return stock;
}