@java.lang.Override
public void handleDelivery(java.lang.String consumerTag, com.rabbitmq.client.Envelope envelope, com.rabbitmq.client.AMQP.BasicProperties properties, byte[] body) throws java.io.IOException {
    try {
        handleOrderResult(new java.lang.String(body, "UTF-8"));
        releaseNetworkResources();
    } catch (java.lang.Exception ex) {
        _logger.error(ex.toString());
    }
}