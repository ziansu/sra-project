@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/saveExamPaper/{examName}")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response saveExamPaper(@javax.ws.rs.PathParam(value = "examName")
java.lang.String exam, java.util.List<com.classapp.db.exam.Exam_Paper> exam_PaperList) {
    com.user.UserBean userBean = ((com.user.UserBean) (request.getSession().getAttribute("user")));
    com.transaction.exams.ExamTransaction examTransaction = new com.transaction.exams.ExamTransaction();
    examTransaction.saveExamPaper(userBean.getRegId(), exam, exam_PaperList, userBean.getRegId());
    return javax.ws.rs.core.Response.status(Status.OK).entity("test").build();
}