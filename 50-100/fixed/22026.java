public static java.lang.String answer(java.lang.String username) {
    trivia.User user = trivia.User.findFirst("username = ?", username);
    java.lang.String description = trivia.Game.getQuestion(username);
    trivia.Question q = trivia.Question.getQuestionByDesc(description);
    return q.getString("option1");
}