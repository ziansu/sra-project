private void close() {
    if (!(connected)) {
        return ;
    }
    connected = false;
    if ((socketChannel) != null) {
        try {
            socketChannel.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    server.removeClient(this);
    de.jackwhite20.japs.server.network.Connection.LOGGER.log(java.util.logging.Level.FINE, "[{0}] Connection closed", remoteAddress.toString());
}