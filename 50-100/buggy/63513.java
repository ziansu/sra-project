@javax.websocket.OnMessage
public void onMessage(com.chatalytics.core.model.ChatAlyticsEvent event) {
    com.chatalytics.web.resources.EventsResource.LOG.debug("Got realtime event: {}", event);
    java.util.Set<javax.websocket.Session> closedSessions = org.apache.storm.shade.com.google.common.collect.Sets.newHashSet();
    for (javax.websocket.Session clientSession : sessions) {
        if (!(clientSession.isOpen())) {
            closedSessions.add(clientSession);
            continue;
        }
        event.setClazz(null);
        clientSession.getAsyncRemote().sendObject(event);
    }
    sessions.removeAll(closedSessions);
}