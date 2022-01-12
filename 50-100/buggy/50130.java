public void start() throws java.lang.Exception {
    restClient.testConnection();
    com.quest.forge.rest.tunnel.client.TunnelClient.logger.info(("Successfully verified rest service " + (restClient.getBaseURL())));
    wsClient = new org.eclipse.jetty.websocket.client.WebSocketClient();
    wsClient.start();
    java.net.URI tunnelServerUri = new java.net.URI(tunnelServerWebsocketUri);
    org.eclipse.jetty.websocket.client.ClientUpgradeRequest request = new org.eclipse.jetty.websocket.client.ClientUpgradeRequest();
    request.setHeader(com.quest.forge.rest.tunnel.common.Constants.HTTP_HEADER_ACCESS_KEY, tunnelServerAccessKey);
    request.setHeader(com.quest.forge.rest.tunnel.common.Constants.HTTP_HEADER_CUSTOM_CODE, customCode);
    wsClient.connect(this, tunnelServerUri, request);
}