public java.util.ArrayList<java.lang.Boolean> areCorrect(java.util.ArrayList<java.lang.String> userAnswers, java.lang.String userID, boolean practiceMode, quizzes.QuestionManager manager) {
    java.lang.System.out.println(userAnswers);
    java.util.ArrayList<java.lang.Boolean> results = new java.util.ArrayList<java.lang.Boolean>(1);
    results.add(isCorrect(userAnswers.get(0), userID, practiceMode, manager));
    return results;
}