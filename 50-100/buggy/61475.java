@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/deleteSubjectTopic/{division}/{subject}/{topic}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteSubjectTopic(@javax.ws.rs.PathParam(value = "division")
java.lang.Integer div_id, @javax.ws.rs.PathParam(value = "subject")
java.lang.Integer sub_id, @javax.ws.rs.PathParam(value = "topic")
java.lang.Integer topic_id) {
    com.tranaction.subject.SubjectTransaction subjectTransaction = new com.tranaction.subject.SubjectTransaction();
    subjectTransaction.deleteTopics(getRegId(), sub_id, div_id, topic_id);
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity("s").build();
}