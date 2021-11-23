@javax.ws.rs.GET
@javax.ws.rs.Path(value = "front/unresolvedQuestions")
public java.util.List<com.bit.ss.model.Question> getUnresolvedQuestionList(@javax.ws.rs.QueryParam(value = "page")
int page) {
    java.util.List<com.bit.ss.model.Question> list = questionService.getUnresolvedQuestionList(page);
    return list;
}