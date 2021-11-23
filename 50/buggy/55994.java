@org.eclipse.jetty.websocket.api.annotations.OnWebSocketError
public void onError(java.lang.Throwable t) {
    com.roboclub.robobuggy.jetty.gui.WSHandler.sgm.removeSession(clientID);
    java.lang.System.out.println(("Error: " + (t.getMessage())));
}