private void write(java.nio.channels.SelectionKey key) {
    com.nginious.http.server.Connection connector = ((com.nginious.http.server.Connection) (key.attachment()));
    try {
        connector.write();
    } catch (java.io.IOException e) {
        com.nginious.http.server.Server.logger.warn("I/O exception on write", e);
        connector.close();
    }
}