@org.springframework.context.annotation.Bean
com.soagrowers.productquery.configuration.EventBusTerminal terminal() {
    org.axonframework.eventhandling.amqp.spring.SpringAMQPTerminal terminal = new org.axonframework.eventhandling.amqp.spring.SpringAMQPTerminal();
    terminal.setConnectionFactory(connectionFactory);
    terminal.setSerializer(axonJsonSerializer());
    terminal.setExchangeName(terminalName);
    terminal.setListenerContainerLifecycleManager(listenerContainerLifecycleManager());
    terminal.setDurable(true);
    terminal.setTransactional(true);
    return terminal;
}