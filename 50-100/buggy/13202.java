private yahoofinance.Stock retrieveFromYahoo(java.lang.String ticker, java.util.Calendar from, java.util.Calendar to) throws java.io.IOException {
    boolean retry = false;
    yahoofinance.Stock stock = null;
    while (retry) {
        retry = false;
        try {
            stock = yahoofinance.YahooFinance.get(ticker, from, to, Interval.WEEKLY);
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