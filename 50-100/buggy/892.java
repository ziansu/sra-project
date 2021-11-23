@java.lang.Override
public org.knowm.xchange.dto.trade.UserTrades getTradeHistory(org.knowm.xchange.service.trade.params.TradeHistoryParams params) throws java.io.IOException {
    org.knowm.xchange.currency.CurrencyPair currencyPair = null;
    java.lang.Integer limit = 100;
    if (params instanceof org.knowm.xchange.service.trade.params.TradeHistoryParamCurrencyPair) {
        currencyPair = ((org.knowm.xchange.service.trade.params.TradeHistoryParamCurrencyPair) (params)).getCurrencyPair();
    }
    if (params instanceof org.knowm.xchange.service.trade.params.TradeHistoryParamLimit) {
        limit = ((org.knowm.xchange.service.trade.params.TradeHistoryParamLimit) (params)).getLimit();
    }
    if (currencyPair == null)
        throw new java.lang.IllegalStateException("Need to supply currency pair");
    
    return new org.knowm.xchange.dto.trade.UserTrades(tradeHistory(currencyPair, limit), Trades.TradeSortType.SortByTimestamp);
}