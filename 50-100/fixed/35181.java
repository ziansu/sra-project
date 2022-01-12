public static int getConsecutiveProfitCount(germes.backtest.BackTestResult backTestResult) throws germes.core.exceptions.TradingException {
    int result = 0;
    int index = 0;
    for (germes.core.entities.position.Order order : backTestResult.getOrders()) {
        if ((order.getResult()) > 0) {
            index++;
            continue;
        }
        if (result < index)
            result = index;
        
        index = 0;
    }
    return result;
}