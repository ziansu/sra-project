private void reset() {
    proxy.onComplete();
    request.reset();
    response.reset();
    proxyHandler.setBufferSize(com.xqbase.tuna.proxy.MAX_BUFFER_SIZE);
    if ((logLevel) >= (com.xqbase.tuna.proxy.ClientConnection.LOG_VERBOSE)) {
        com.xqbase.util.Log.v((((((proxy.getClientMap(secure).get(host)) == null ? "Client Closed" : "Client Kept Alive") + " and Request Unblocked due to ") + "Complete Request and Response, ") + (toString(false))));
    }
    proxy.clearCurrentClient();
    proxy.read();
}