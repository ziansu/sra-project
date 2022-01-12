public boolean addQuiz(sourcePackage.Quiz quiz, java.sql.Connection connection) {
    if ((connection == null) || (quiz == null))
        return false;
    
    try {
        addQuizBase(quiz, connection);
        try {
            addQuestions(quiz, connection);
        } catch (java.lang.Exception e) {
            removeQuizFromDB(quiz.getName(), connection);
            return false;
        }
    } catch (java.sql.SQLException e) {
        return false;
    }
    return true;
}