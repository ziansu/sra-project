@org.springframework.context.annotation.Bean
com.soagrowers.productquery.configuration.EventBusTerminal terminal() {
    org.axonframework.eventhandling.amqp.spring.SpringAMQPTerminal terminal = new org.axonframework.eventhandling.amqp.spring.SpringAMQPTerminal();
    terminal.setConnectionFactory(connectionFactory);
    terminal.setExchangeName(terminalName);
    terminal.setDurable(true);
    terminal.setTransactional(true);
    terminal.setSerializer(axonJsonSerializer());
    terminal.setListenerContainerLifecycleManager(listenerContainerLifecycleManager());
    return terminal;
}