public void disconnect() throws java.io.IOException {
    org.phoenixframework.channels.Socket.LOG.log(java.util.logging.Level.FINE, "disconnect");
    if ((webSocket) != null) {
        webSocket.close(1001, "Disconnected by client");
    }
    cancelHeartbeatTimer();
}