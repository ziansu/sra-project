@java.lang.Override
public void onCompleted(java.lang.Exception ex) {
    org.phoenixframework.channels.Socket.LOG.log(java.util.logging.Level.FINE, "WebSocket onClose ");
    this.webSocket = null;
    scheduleReconnectTimer();
    for (final org.phoenixframework.channels.ISocketCloseCallback callback : socketCloseCallbacks) {
        callback.onClose();
    }
}