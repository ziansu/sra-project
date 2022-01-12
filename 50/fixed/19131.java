@org.springframework.context.event.EventListener
protected void unregister(org.springframework.context.event.ContextClosedEvent event) {
    unregister();
}