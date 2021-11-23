public boolean isOpen() {
    if (!(channel.isOpen())) {
        try {
            connection.createChannel();
        } catch (java.io.IOException e) {
            org.apache.axis2.transport.rabbitmq.RMQChannel.log.error("Error creating channel for dual channel", e);
            return false;
        }
    }
    return true;
}