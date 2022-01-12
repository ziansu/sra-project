public void configureMessageBroker(org.springframework.messaging.simp.config.MessageBrokerRegistry registry) {
    registry.enableSimpleBroker("/topic", "/queue");
    registry.setApplicationDestinationPrefixes("/app", "/topic");
}