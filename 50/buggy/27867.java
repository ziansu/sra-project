public long toUsDollar() {
    return io.zipcoder.aaronlong.wutangfinancial.Money.convertToUsDollar(quantity, currency.getExchangeRate());
}