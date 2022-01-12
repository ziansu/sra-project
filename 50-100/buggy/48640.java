public void onMessage(org.ikasan.component.endpoint.jms.consumer.Message message) {
    if ((this.eventListener) == null) {
        throw new java.lang.RuntimeException("No active eventListeners registered!");
    }
    try {
        org.ikasan.spec.flow.FlowEvent<?, ?> flowEvent = flowEventFactory.newEvent(this.managedEventIdentifierService.getEventIdentifier(message), extractContent(message));
        this.eventListener.invoke(flowEvent);
    } catch (org.ikasan.spec.event.ManagedEventIdentifierException | org.ikasan.component.endpoint.jms.consumer.JMSException e) {
        this.eventListener.invoke(e);
    }
}