public void addQuestionToDatabase(int quizId, int sequenceNumber, java.sql.Statement stm) {
    try {
        questionId = addQuestionToQuestions(stm, DBContract.QuestionTypesEnum.MULTIPLE_CHOICE);
        addQuestionToQuizQuestions(quizId, questionId, sequenceNumber, stm);
        addAnswers(stm);
        addToTypeTable(stm);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}