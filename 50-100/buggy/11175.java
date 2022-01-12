@java.lang.Override
public void storePublishForFuture(org.eclipse.moquette.spi.impl.events.PublishEvent evt) {
    java.util.List<org.eclipse.moquette.spi.impl.storage.StoredPublishEvent> storedEvents;
    java.lang.String clientID = evt.getClientID();
    if (!(m_persistentMessageStore.containsKey(clientID))) {
        storedEvents = new java.util.ArrayList<>();
    }else {
        storedEvents = m_persistentMessageStore.get(clientID);
    }
    storedEvents.add(convertToStored(evt));
    m_persistentMessageStore.put(clientID, storedEvents);
    m_db.commit();
    org.eclipse.moquette.spi.persistence.MapDBPersistentStore.LOG.debug("Stored published message for client <{}> on topic <{}>", clientID, evt.getTopic());
}