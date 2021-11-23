private org.eclipse.jetty.websocket.WebSocketConnection newWebSocketConnection() throws java.io.IOException {
    org.eclipse.jetty.websocket.WebSocketClientFactory.__log.debug("newWebSocketConnection()");
    return new org.eclipse.jetty.websocket.WebSocketClientFactory.WebSocketClientConnection(_future._client.getFactory(), _future.getWebSocket(), _endp, _buffers, java.lang.System.currentTimeMillis(), _future.getMaxIdleTime(), _protocol, null, WebSocketConnectionRFC6455.VERSION, _future.getMaskGen());
}