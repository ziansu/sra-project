@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{messageId}")
public org.winio94.java.messenger.model.Message updateMessage(@javax.ws.rs.PathParam(value = "messageId")
long id, org.winio94.java.messenger.model.Message message) {
    return org.winio94.java.messenger.service.MessageService.updateMessage(id, message);
}