public com.nab.skilltest.model.Question transform(com.nab.skilltest.model.Question question) {
    com.nab.skilltest.model.Question uiquestion = new com.nab.skilltest.model.Question();
    if (question != null) {
        uiquestion.setQuestionText(question.getDescription());
        uiquestion.setAnswersOptions(question.getAnswerOptions());
        uiquestion.setQuestionType(question.getqType());
        uiquestion.setQuestionId(question.getId());
    }
    return uiquestion;
}