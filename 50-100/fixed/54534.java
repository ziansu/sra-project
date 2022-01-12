private org.springframework.jms.listener.DefaultMessageListenerContainer createContainer(javax.jms.ConnectionFactory connectionFactory) {
    javax.jms.Destination destination = new javax.jms.Destination() {    };
    org.springframework.jms.listener.DefaultMessageListenerContainer container = new org.springframework.jms.listener.DefaultMessageListenerContainer();
    container.setConnectionFactory(connectionFactory);
    container.setCacheLevel(DefaultMessageListenerContainer.CACHE_NONE);
    container.setDestination(destination);
    return container;
}