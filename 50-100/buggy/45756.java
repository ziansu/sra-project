@org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage
public void onMessage(java.lang.String message) {
    java.lang.System.out.println(message);
    org.eclipse.jetty.websocket.api.Session session = com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.removeSession(clientID);
    for (java.lang.String groupName : com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.getClients().keySet()) {
        if (message.toLowerCase().contains(groupName)) {
            com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.addSessionToGroup(groupName, session);
            return ;
        }
    }
    com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.addSessionToGroup("unsorted", session);
}