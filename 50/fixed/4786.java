private static long convertToUsDollar(long quantity, long exchange) {
    return io.zipcoder.aaronlong.wutangfinancial.Money.convertRate(quantity, Currencies.USDOLLAR.getExchangeRate(), exchange);
}