public double getprice(java.lang.String symbol) throws java.io.IOException {
    yahoofinance.Stock stock = yahoofinance.YahooFinance.get(symbol);
    if (stock == null)
        return -1;
    
    java.lang.String name = stock.getName();
    if ((name.compareTo("N/A")) == 0)
        return -1;
    
    java.math.BigDecimal price_dec = stock.getQuote().getPrice();
    java.lang.Double price_dub = price_dec.doubleValue();
    return price_dub;
}