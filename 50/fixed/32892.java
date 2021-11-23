public java.util.ArrayList<data.Quiz> getAllCreatedQuizzes() throws java.sql.SQLException {
    return data.Quiz.findQuizzes(null, false, null, null, username, null, null, false, data.Account.MAX_RECENT_QUIZZES);
}