private void clearGivenWhenState() {
    storedEvents = new java.util.LinkedList<org.axonframework.domain.DomainEventMessage>();
    publishedEvents = new java.util.ArrayList<org.axonframework.domain.EventMessage>();
    givenEvents = new java.util.ArrayList<org.axonframework.domain.DomainEventMessage>();
    sequenceNumber = 0;
}