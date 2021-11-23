private void disconnect() {
    factory.dispose(socketAddress);
    try {
        if (channel.isOpen()) {
            channel.close();
        }
    } catch (java.io.IOException e) {
        com.github.apetrelli.scafa.http.impl.AbstractHttpConnection.LOG.log(java.util.logging.Level.WARNING, "Error when closing channel", e);
    }
}