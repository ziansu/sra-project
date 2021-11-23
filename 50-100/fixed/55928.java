public onefengma.demo.server.model.order.Order generateOrder() {
    onefengma.demo.server.model.order.Order order = new onefengma.demo.server.model.order.Order();
    order.buyerId = getUserId();
    order.count = count;
    order.productId = productId;
    order.productType = productType;
    order.status = 0;
    order.sellTime = java.lang.System.currentTimeMillis();
    order.timeLimit = timeLimit;
    return order;
}