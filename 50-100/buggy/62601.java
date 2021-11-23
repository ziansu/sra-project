private void sendMessage(java.lang.String exchange, java.lang.String routingKey, java.lang.String message) {
    eu.h2020.symbiote.messaging.AMQP.BasicProperties props;
    eu.h2020.symbiote.messaging.Channel channel = null;
    try {
        channel = this.connection.createChannel();
        props = new eu.h2020.symbiote.messaging.AMQP.BasicProperties().builder().contentType("application/json").build();
        channel.basicPublish(exchange, routingKey, props, message.getBytes());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        closeChannel(channel);
    }
}