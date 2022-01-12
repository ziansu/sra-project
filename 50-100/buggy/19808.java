@java.lang.Override
public void onMessage(org.webbitserver.WebSocketConnection connection, java.lang.String msg) throws java.lang.Throwable {
    log.debug("Websocket message received ({}): {}", connection.httpRequest().remoteAddress(), msg);
    server.supplyMessage(new com.pploder.ehc.SimpleMessage(getHttpConsole(), connections.get(connection), msg));
}