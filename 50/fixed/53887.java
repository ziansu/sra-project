@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/deleteExam/{exam}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteExam(@javax.ws.rs.PathParam(value = "exam")
java.lang.Integer exam_id) {
    com.transaction.exams.ExamTransaction examTransaction = new com.transaction.exams.ExamTransaction();
    examTransaction.deleteExam(getRegId(), exam_id);
    return javax.ws.rs.core.Response.status(Response.Status.OK).build();
}