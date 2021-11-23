@java.lang.Override
public void start() {
    for (org.springframework.jms.listener.MessageListenerContainer listenerContainer : getListenerContainers()) {
        org.springframework.jms.config.JmsListenerEndpointRegistry.startIfNecessary(listenerContainer);
    }
}