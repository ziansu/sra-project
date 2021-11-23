@javax.websocket.OnClose
@javax.transaction.Transactional
public void onClose(final javax.websocket.Session session, javax.websocket.CloseReason closeReason, @javax.websocket.server.PathParam(value = "EVENTID")
java.lang.Long eventId, @javax.websocket.server.PathParam(value = "MATERIALID")
java.lang.Long materialId, @javax.websocket.server.PathParam(value = "PARTICIPANTID")
java.lang.Long participantId, @javax.websocket.server.PathParam(value = "KEY")
java.lang.String key) {
    synchronized(this) {
        removeClient(eventId, materialId);
    }
}