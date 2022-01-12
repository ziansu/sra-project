private void reset() {
    request.reset();
    response.reset();
    proxy.clearCurrentClient();
    proxyHandler.setBufferSize(com.xqbase.tuna.proxy.MAX_BUFFER_SIZE);
    if ((logLevel) >= (com.xqbase.tuna.proxy.ProxyConnection.LOG_VERBOSE)) {
        com.xqbase.util.Log.v((("Client Kept Alive and Request Unblocked due to " + "Complete Request and Response, ") + (toString(false))));
    }
    proxy.read();
}