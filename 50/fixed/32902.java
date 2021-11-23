@java.lang.Override
public java.util.List<com.bit.ss.model.Answer> getAnswerListByQuestionId(int questionId, int page) {
    int start = (ANSWER_PAGESIZE) * (page - 1);
    return questionMapper.getAnswerListByQuestionId(questionId, start, com.bit.ss.service.ANSWER_PAGESIZE);
}