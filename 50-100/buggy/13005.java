private boolean getNextQuestion() {
    currentQuestion = quiz.nextQuestion();
    if ((currentQuestion) == null) {
        currentState = backend.GameState.GAME_OVER;
        return false;
    }
    lblCurrentQ.setText(currentQuestion.getQ());
    int index = 0;
    for (java.lang.String ans : currentQuestion.getAnswers()) {
        answers[index].setText(ans);
        index++;
    }
    lblTime.setText(java.lang.Integer.toString(currentQuestion.getTimeLimit()));
    currentState = backend.GameState.WAITING_FOR_ANSWERS;
    broadcastToClients(NetworkMessages.nextQ);
    return true;
}