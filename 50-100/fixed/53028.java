@javax.websocket.OnClose
public void onClose(javax.websocket.Session session) {
    de.dhbwka.java.servlet.Servlet.LOGGER.info("Session {} has ended. Client {} disconnected", session.getId(), de.dhbwka.java.servlet.Servlet.clients.get(session.getId()).getUsername());
    de.dhbwka.java.servlet.Servlet.server.removeClient(de.dhbwka.java.servlet.Servlet.clients.get(session.getId()));
    de.dhbwka.java.servlet.Servlet.clients.remove(session.getId());
}