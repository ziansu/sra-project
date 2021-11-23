private static java.util.Map<java.lang.String, java.lang.Object> attributes(org.atmosphere.websocket.WebSocket webSocket, org.atmosphere.cpr.AtmosphereRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> m = new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>();
    m.putAll(webSocket.attributes());
    return m;
}