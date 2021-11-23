@org.axonframework.eventhandling.amqp.spring.Before
public void setUp() throws java.lang.Exception {
    try {
        com.rabbitmq.client.Channel channel = connectionFactory.createConnection().createChannel(false);
        if (channel.isOpen()) {
            channel.close();
        }
    } catch (java.lang.Exception e) {
        assumeNoException(e);
    }
}