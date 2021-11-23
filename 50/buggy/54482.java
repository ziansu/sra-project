private java.lang.String getStockData(java.lang.String exchange, java.lang.String ticker, java.lang.String reportType, java.lang.String period) {
    return textClient.getBlogText(java.lang.String.format(com.dando.stockboss.client.MorningstarClient.parametrizedUrl, exchange, ticker, reportType));
}