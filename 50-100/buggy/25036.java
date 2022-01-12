@java.lang.Override
public boolean stopConsuming() {
    boolean out = true;
    try {
        channel.close();
        connection.close();
    } catch (java.io.IOException e) {
        sonata.kernel.vimadaptor.messaging.RabbitMqConsumer.Logger.error(e.getMessage(), e);
        out = false;
    } catch (java.util.concurrent.TimeoutException e) {
        sonata.kernel.vimadaptor.messaging.RabbitMqConsumer.Logger.error(e.getMessage(), e);
        out = false;
    }
    return out;
}