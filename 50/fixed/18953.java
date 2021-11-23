@java.lang.Override
public org.knowm.xchange.dto.trade.OpenOrders getOpenOrders() throws java.io.IOException, org.knowm.xchange.exceptions.ExchangeException, org.knowm.xchange.exceptions.NotAvailableFromExchangeException, org.knowm.xchange.exceptions.NotYetImplementedForExchangeException {
    return new org.knowm.xchange.dto.trade.OpenOrders(getOpenOrders(null, null));
}