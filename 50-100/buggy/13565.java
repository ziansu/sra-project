protected void register(com.github.natanbc.gateway.server.ServerWebSocketClient client) throws java.io.IOException {
    channel.basicConsume((("shard-" + (shardId)) + "-send"), false, new com.rabbitmq.client.DefaultConsumer(channel) {
        @java.lang.Override
        public void handleDelivery(java.lang.String consumerTag, com.rabbitmq.client.Envelope envelope, com.rabbitmq.client.AMQP.BasicProperties properties, byte[] body) throws java.io.IOException {
            client.send(new java.lang.String(body, java.nio.charset.StandardCharsets.UTF_8));
            channel.basicAck(envelope.getDeliveryTag(), false);
        }
    });
}