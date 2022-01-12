@java.lang.Override
public boolean cancelOrder(org.knowm.xchange.service.trade.params.CancelOrderParams orderParams) throws java.io.IOException, org.knowm.xchange.exceptions.ExchangeException, org.knowm.xchange.exceptions.NotAvailableFromExchangeException, org.knowm.xchange.exceptions.NotYetImplementedForExchangeException {
    if (orderParams instanceof org.knowm.xchange.service.trade.params.CancelOrderByIdParams) {
        org.knowm.xchange.service.trade.params.CancelOrderByIdParams params = ((org.knowm.xchange.service.trade.params.CancelOrderByIdParams) (orderParams));
        return cancel(params.orderId);
    }else {
        throw new java.lang.IllegalStateException(("Dont understand " + orderParams));
    }
}