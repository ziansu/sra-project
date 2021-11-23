void close() {
    try {
        if ((client) != null) {
            client.shutDown();
        }
    } catch (java.lang.InterruptedException e) {
        org.ballerinalang.plugins.idea.debugger.BallerinaWebSocketConnector.LOGGER.debug(e);
    }
}