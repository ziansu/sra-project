private long convertToCurrency(long usDollars) {
    double exchange;
    long exchangeRate = currency.getExchangeRate();
    if (exchangeRate > 100) {
        exchange = (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(usDollars)) * (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(exchangeRate));
    }else
        if (exchangeRate < 100) {
            exchange = (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(usDollars)) / (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(exchangeRate));
        }else {
            exchange = usDollars;
        }
    
    return io.zipcoder.aaronlong.wutangfinancial.Money.upHandleDoubles(exchange);
}