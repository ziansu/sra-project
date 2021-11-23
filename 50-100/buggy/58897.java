private static java.util.Map<java.lang.String, java.lang.Object> attributes(org.atmosphere.websocket.WebSocket webSocket, org.atmosphere.cpr.AtmosphereRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> m = new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>();
    try {
        if (webSocket.awaitForOpenProcessed()) {
            m.putAll(request.localAttributes());
        }
    } catch (java.lang.InterruptedException e) {
        org.atmosphere.websocket.protocol.ProtocolUtil.logger.warn("Unable to retrieve native request attributes {}", webSocket);
    }
    return m;
}