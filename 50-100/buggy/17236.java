protected void doInitParamsForWebSocket(javax.servlet.ServletConfig sc) {
    java.lang.String s = sc.getInitParameter(org.atmosphere.cpr.ApplicationConfig.WEBSOCKET_SUPPORT);
    if ((s != null) && (java.lang.Boolean.parseBoolean(s))) {
        webSocketEnabled = true;
        sessionSupport(false);
    }
    s = sc.getInitParameter(org.atmosphere.cpr.ApplicationConfig.WEBSOCKET_PROTOCOL);
    if (s != null) {
        webSocketProtocolClassName = s;
    }
}