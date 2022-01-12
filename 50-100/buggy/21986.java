private void releaseNetworkResources() throws java.io.IOException, java.util.concurrent.TimeoutException {
    if ((_ordersChannel) != null) {
        _ordersChannel.close();
        _ordersChannel = null;
    }
    if ((_resultsChannel) != null) {
        _ordersChannel.close();
        _ordersChannel = null;
    }
    if ((_shippingChannel) != null) {
        _shippingChannel.close();
        _shippingChannel = null;
    }
    if ((_connection) != null) {
        _connection.close();
        _connection = null;
    }
}