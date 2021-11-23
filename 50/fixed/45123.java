@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{commentId}")
public org.winio94.java.messenger.model.Comment updateComment(@javax.ws.rs.PathParam(value = "commentId")
long commentId, @javax.ws.rs.PathParam(value = "messageId")
long messageId, org.winio94.java.messenger.model.Comment comment) {
    return org.winio94.java.messenger.service.CommentService.updateComment(messageId, commentId, comment);
}