public void disconnectAll(final java.lang.String message) {
    for (com.dmdirc.Server server : servers) {
        server.disconnect(message);
    }
}