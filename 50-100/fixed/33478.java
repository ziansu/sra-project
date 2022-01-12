@java.lang.Override
public void close() {
    if ((channel) != null) {
        try {
            channel.close();
            channel = null;
        } catch (java.io.IOException | java.util.concurrent.TimeoutException e) {
            log.error("Could not close channel {}", channel, e);
        }
    }
    if ((connection) != null) {
        try {
            connection.close();
            connection = null;
        } catch (java.io.IOException e) {
            log.error("Could not close connection {}", connection, e);
        }
    }
}