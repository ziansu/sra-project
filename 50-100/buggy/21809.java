public long createQuiz(com.UndefinedParameter.app.core.Quiz quiz, long groupID) {
    long rvalue = quizDAO.createQuiz(quiz.getCreatorId(), com.UndefinedParameter.app.core.InputUtils.sanitizeInput(quiz.getName()), quiz.getDifficulty(), quiz.getRating(), com.UndefinedParameter.app.core.InputUtils.sanitizeInput(quiz.getDescription()), quiz.getTime(), quiz.isOpen());
    com.UndefinedParameter.app.core.UserGroupManager usrGrpM = null;
    usrGrpM.addPoints(quiz.getCreatorId(), groupID, 5);
    return rvalue;
}