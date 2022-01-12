private static long convertToUsDollar(long quantity, long exchange) {
    if (exchange > 100) {
        double total = quantity / (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(exchange));
        return io.zipcoder.aaronlong.wutangfinancial.Money.upHandleDoubles(total);
    }else
        if (exchange < 100) {
            double total = quantity * (io.zipcoder.aaronlong.wutangfinancial.Money.downHandleDoubles(exchange));
            return io.zipcoder.aaronlong.wutangfinancial.Money.upHandleDoubles(total);
        }
    
    return quantity;
}