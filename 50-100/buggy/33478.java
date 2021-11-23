public void close() {
    if ((channel) != null) {
        try {
            channel.close();
        } catch (java.io.IOException | java.util.concurrent.TimeoutException e) {
            log.error("Could not close channel {}", channel, e);
        }
    }
    if ((connection) != null) {
        try {
            connection.close();
        } catch (java.io.IOException e) {
            log.error("Could not close connection {}", connection, e);
        }
    }
}