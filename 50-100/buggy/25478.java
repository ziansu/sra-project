@java.lang.Override
public void onClose(final int code, final java.lang.String reason) {
    org.phoenixframework.channels.Socket.LOG.log(java.util.logging.Level.FINE, "WebSocket onClose {0}/{1}", new java.lang.Object[]{ code , reason });
    this.webSocket = null;
    scheduleReconnectTimer();
    for (final org.phoenixframework.channels.ISocketCloseCallback callback : socketCloseCallbacks) {
        callback.onClose();
    }
}