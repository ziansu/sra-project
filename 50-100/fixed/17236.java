protected void doInitParamsForWebSocket(javax.servlet.ServletConfig sc) {
    java.lang.String s = sc.getInitParameter(org.atmosphere.cpr.ApplicationConfig.WEBSOCKET_SUPPORT);
    if (s != null) {
        webSocketEnabled = java.lang.Boolean.parseBoolean(s);
        sessionSupport(false);
    }
    s = sc.getInitParameter(org.atmosphere.cpr.ApplicationConfig.WEBSOCKET_PROTOCOL);
    if (s != null) {
        webSocketProtocolClassName = s;
    }
}