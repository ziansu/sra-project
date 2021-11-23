public com.rabbitmq.client.Channel getChannel() {
    if (!(channel.isOpen())) {
        try {
            org.apache.axis2.transport.rabbitmq.RMQChannel.log.debug("Channel is closed. Creating a new channel");
            connection.createChannel();
        } catch (java.io.IOException e) {
            org.apache.axis2.transport.rabbitmq.RMQChannel.log.error("Error creating channel for dual channel", e);
            return null;
        }
    }
    return channel;
}