private long convertToCurrency(long usDollars) {
    long exchangeRate = currency.getExchangeRate();
    double exchange;
    if (exchangeRate > 100) {
        exchange = (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(usDollars)) * exchangeRate;
    }else
        if (exchangeRate < 100) {
            exchange = (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(usDollars)) / exchangeRate;
        }else {
            exchange = usDollars;
        }
    
    return io.zipcoder.aaronlong.wutangfinancial.Money.upHandleDoubles(exchange);
}