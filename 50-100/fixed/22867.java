private javax.websocket.ClientEndpointConfig buildClientConfig(javax.websocket.ClientEndpointConfig.Configurator configurator) {
    javax.websocket.ClientEndpointConfig config = ClientEndpointConfig.Builder.create().configurator(configurator).build();
    configureClientEndpoint(config);
    javax.net.ssl.SSLContext sslContext = buildSslContext(trustSelfSignedCerts);
    java.util.Map<java.lang.String, java.lang.Object> userProperties = config.getUserProperties();
    userProperties.put(WsWebSocketContainer.SSL_CONTEXT_PROPERTY, sslContext);
    return config;
}