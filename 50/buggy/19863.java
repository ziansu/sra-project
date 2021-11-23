@java.lang.Override
public void registerStompEndpoints(final websockettest.configuration.SocketConfig.StompEndpointRegistry registry) {
    registry.addEndpoint("/chat").withSockJS();
}