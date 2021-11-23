@java.lang.Override
public java.util.List<com.bit.ss.model.Answer> getAnswerListByQuestionId(int questionId, int page, java.lang.Integer userId) {
    int start = (ANSWER_PAGESIZE) * (page - 1);
    return questionMapper.getAnswerListByQuestionId(questionId, userId, start, com.bit.ss.service.ANSWER_PAGESIZE);
}