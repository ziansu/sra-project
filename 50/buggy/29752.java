public void addUserAnswer(int questionNum, java.lang.String answer) {
    if ((quizzes.MultiplePageQuiz.userAnswers) != null)
        quizzes.MultiplePageQuiz.userAnswers.put(questionNum, answer);
    else
        java.lang.System.out.println("userAnswers is Null!");
    
}