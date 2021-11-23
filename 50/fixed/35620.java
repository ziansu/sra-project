public void nextQuestion() {
    if ((quiz.getQuestions().size()) <= ((currentQuestionIndex) + 1))
        throw new quiz.entities.QuizRunner.NoNextQuestionException();
    
    (currentQuestionIndex)++;
}