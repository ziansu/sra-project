public void closeSession(javax.websocket.Session session, java.lang.String ticket) {
    sessions.remove(ticket);
    webSocketTicketController.removeTicket(ticket);
}