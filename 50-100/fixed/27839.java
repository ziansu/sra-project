private void addEventSubscriber(org.eclipse.smarthome.core.events.EventSubscriber eventSubscriber) {
    java.util.Set<java.lang.String> subscribedEventTypes = eventSubscriber.getSubscribedEventTypes();
    for (java.lang.String subscribedEventType : subscribedEventTypes) {
        synchronized(this) {
            if (!(typedEventSubscribers.containsEntry(subscribedEventType, eventSubscriber))) {
                typedEventSubscribers.put(subscribedEventType, eventSubscriber);
            }
        }
    }
}