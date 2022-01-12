public void createQuizz(com.stratelia.webactiv.questionContainer.model.QuestionContainerDetail quizzDetail, java.lang.String componentId) throws com.stratelia.webactiv.quizz.QuizzException {
    com.stratelia.webactiv.questionContainer.model.QuestionContainerPK qcPK = new com.stratelia.webactiv.questionContainer.model.QuestionContainerPK(null, null, componentId);
    try {
        qcPK = questionContainerService.createQuestionContainer(qcPK, quizzDetail, getUserId());
    } catch (java.lang.Exception e) {
        throw new com.stratelia.webactiv.quizz.QuizzException("QuizzSessionController.createQuizz", com.stratelia.webactiv.quizz.QuizzException.ERROR, "Quizz.EX_PROBLEM_TO_CREATE", e);
    }
    classifyContent(quizzDetail, qcPK);
}