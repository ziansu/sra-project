@java.lang.Override
public void registerStompEndpoints(org.springframework.web.socket.config.annotation.StompEndpointRegistry registry) {
    registry.addEndpoint("/websocket").setAllowedOrigins("*").withSockJS();
}