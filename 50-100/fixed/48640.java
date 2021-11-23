public void onMessage(org.ikasan.component.endpoint.jms.consumer.Message message) {
    if ((this.eventListener) == null) {
        throw new java.lang.RuntimeException("No active eventListeners registered!");
    }
    org.ikasan.spec.flow.FlowEvent<?, ?> flowEvent = flowEventFactory.newEvent(this.managedEventIdentifierService.getEventIdentifier(message), message);
    this.eventListener.invoke(flowEvent);
}