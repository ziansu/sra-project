public boolean isPayedOrder(java.lang.String orderId) {
    io.reactivesw.payment.domain.service.PayedOrderService.LOG.debug("Enter. OrderId: {}.", orderId);
    boolean result = true;
    io.reactivesw.payment.domain.model.PayedOrder order = repository.findOne(io.reactivesw.payment.infrastructure.repository.PayedOrderSpecification.exist(orderId));
    if (order == null) {
        result = false;
    }
    io.reactivesw.payment.domain.service.PayedOrderService.LOG.debug("Exit. Result: {}.", result);
    return result;
}