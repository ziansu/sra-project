public beans.Question getNextQuestion() {
    if (((usedQuestion) != null) && ((usedQuestion.size()) > 0)) {
        if (currentQuestionAnswered) {
            currentQuestionAnswered = false;
            currentQuestion = usedQuestion.getFirst();
            usedQuestion.removeFirst();
        }
        return currentQuestion;
    }
    return null;
}