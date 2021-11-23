@java.lang.Override
public com.rabbitmq.client.AMQP.Queue.DeclareOk doInRabbit(com.maxxton.aam.communication.Channel channel) throws java.lang.Exception {
    try {
        com.maxxton.aam.resources.Configuration config = objResources.getConfiguration();
        java.lang.String name = ((config.getQueuePrefix()) + receiver) + (config.getQueueSuffix());
        return channel.queueDeclarePassive(name);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}