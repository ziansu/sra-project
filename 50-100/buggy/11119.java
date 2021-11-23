@javax.websocket.OnClose
public void close(javax.websocket.Session session, javax.websocket.CloseReason reason) {
    if (session.getRequestURI().getPath().startsWith(com.chatalytics.web.resources.EventsResource.RT_EVENT_ENDPOINT)) {
        com.chatalytics.web.resources.EventsResource.LOG.info("Closing session {}. Reason {}", session.getId(), reason);
        try {
            session.close();
            sessions.remove(session);
        } catch (java.io.IOException e) {
            com.chatalytics.web.resources.EventsResource.LOG.warn("Couldn't close {}", session.getId());
        }
    }else {
        connectedToCompute = false;
    }
}