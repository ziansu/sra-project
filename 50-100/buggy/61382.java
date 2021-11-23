public void estimateAnswers(java.util.HashMap<java.lang.String, java.lang.String> questionIDsAndAnswersOfUser) {
    java.util.HashMap<java.lang.String, java.lang.String> answers = questionIDsAndAnswersOfUser;
    for (int i = 0; i < (questions.size()); i++) {
        questions.get(i).estimateAnswer(answers.get(("" + (i + 1))));
    }
}