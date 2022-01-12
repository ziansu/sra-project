public void connect() throws java.io.IOException {
    org.phoenixframework.channels.Socket.LOG.log(java.util.logging.Level.FINE, "connect");
    disconnect();
    final com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder().url(this.endpointUri).build();
    final com.squareup.okhttp.ws.WebSocketCall wsCall = com.squareup.okhttp.ws.WebSocketCall.create(httpClient, request);
    wsCall.enqueue(wsListener);
}