@java.lang.Override
public org.knowm.xchange.dto.trade.OpenOrders getOpenOrders(org.knowm.xchange.service.trade.params.orders.OpenOrdersParams params) throws java.io.IOException, org.knowm.xchange.exceptions.ExchangeException, org.knowm.xchange.exceptions.NotAvailableFromExchangeException, org.knowm.xchange.exceptions.NotYetImplementedForExchangeException {
    org.knowm.xchange.currency.CurrencyPair currencyPair = null;
    java.lang.Integer count = 100;
    if (params instanceof org.knowm.xchange.service.trade.params.orders.OpenOrdersParamCurrencyPair) {
        currencyPair = ((org.knowm.xchange.service.trade.params.orders.OpenOrdersParamCurrencyPair) (params)).getCurrencyPair();
    }
    return new org.knowm.xchange.dto.trade.OpenOrders(getOpenOrders(currencyPair, count));
}