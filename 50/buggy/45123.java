@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{commentId}")
public org.winio94.java.messenger.model.Comment updateComment(@javax.ws.rs.PathParam(value = "messageId")
long messageId, @javax.ws.rs.PathParam(value = "commentId")
long commentId, org.winio94.java.messenger.model.Comment comment) {
    return org.winio94.java.messenger.service.CommentService.updateComment(commentId, messageId, comment);
}