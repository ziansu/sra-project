@java.lang.Override
public void setupEventPlatform() {
    de.hpi.bpt.argos.properties.PropertyReader propertyReader = new de.hpi.bpt.argos.properties.PropertyReaderImpl();
    java.lang.String eventPlatformHost = propertyReader.getProperty(de.hpi.bpt.argos.eventHandling.EventSubscriber.getEventPlatformHostPropertyKey());
    java.lang.String eventPlatformEventQueryUri = propertyReader.getProperty(de.hpi.bpt.argos.eventHandling.EventSubscriber.getEventPlatformEventQueryUriPropertyKey());
    java.lang.String eventPlatformEventTypeUri = propertyReader.getProperty(de.hpi.bpt.argos.eventHandling.EventSubscriber.getEventPlatformEventTypeUriPropertyKey());
    setupEventPlatform(eventPlatformHost, eventPlatformEventTypeUri, eventPlatformEventQueryUri);
}