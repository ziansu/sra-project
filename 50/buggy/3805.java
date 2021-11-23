@javax.websocket.OnMessage
public void onMessage(java.lang.String message, javax.websocket.Session session) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.System.out.println(("User input: " + message));
    serverProcess(session, message);
    java.lang.System.out.println(("nbr joueurs " + (ServerSupport.joueurs.size())));
}