private void sendOrder() throws java.io.IOException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
    _ordersChannel = _connection.createChannel();
    _ordersChannel.queueDeclare(_ordersExchangeName, true, false, false, null);
    core.Order order = generateOrder();
    _ordersChannel.basicPublish("", _ordersExchangeName, MessageProperties.PERSISTENT_TEXT_PLAIN, order.serialize());
    _logger.trace((((_name) + " sent order ") + (order.toString())));
    releaseNetworkResources();
}