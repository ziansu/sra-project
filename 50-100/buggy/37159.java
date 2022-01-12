private void processNewOrder(mt.Order order) throws mt.exception.ServerException {
    mt.server.MicroServer.LOGGER.log(java.util.logging.Level.INFO, "Processing new order...");
    verifyUnfulfilledSellOrders(order.getNickname());
    verifyOrderMinimumQuantity(order);
    saveOrder(order);
    if (order.isBuyOrder()) {
        processBuy(order);
    }
    if (order.isSellOrder()) {
        processSell(order);
    }
    notifyClientsOfChangedOrders();
    removeFulfilledOrders();
    updatedOrders = new java.util.HashSet<>();
}