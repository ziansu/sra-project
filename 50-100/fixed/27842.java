public synchronized void handleAvailableMovie(java.lang.String movie) {
    java.util.Enumeration<com.tradeshow.trader.ClientConnectionHandler> tce;
    com.tradeshow.trader.TradeClient current;
    com.tradeshow.trader.ClientConnectionHandler cch;
    tce = connectionList.elements();
    while (tce.hasMoreElements()) {
        cch = tce.nextElement();
        java.lang.System.out.println(cch);
        current = clientList.get(cch);
        current.showMessage(movie);
    } 
}