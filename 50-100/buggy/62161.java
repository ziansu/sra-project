@javax.websocket.OnOpen
public void showTime(javax.websocket.Session session, javax.websocket.EndpointConfig config) {
    allSessions = session.getOpenSessions();
    username = ((java.lang.String) (config.getUserProperties().get("user")));
    if (allSessions.isEmpty()) {
        ro.msg.edu.client.beans.WebSocketNotification.timer.scheduleAtFixedRate(() -> sendNotifications(session), 0, 60, java.util.concurrent.TimeUnit.SECONDS);
    }
}