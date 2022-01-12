public java.math.BigDecimal getMA(int daysAgo, int days) throws java.io.IOException {
    java.util.List<yahoofinance.histquotes.HistoricalQuote> quotes = getHistory(daysAgo, days);
    java.math.BigDecimal ma = new java.math.BigDecimal(0);
    for (yahoofinance.histquotes.HistoricalQuote quote : quotes) {
        ma.add(quote.getAdjClose());
    }
    ma.divide(new java.math.BigDecimal(days));
    return ma;
}