public void determineCurrentState() {
    java.time.Instant now = clock.instant();
    if (startTime.plusSeconds(timeUntilGameClosureInSeconds).isBefore(now)) {
        currentState = com.pw.quizwhizz.model.game.GameState.CLOSED;
    }else
        if ((startTime.plusSeconds(timeUntilAnswerEvaluationInSeconds).isBefore(now)) && (startTime.plusSeconds(timeUntilGameClosureInSeconds).isAfter(now))) {
            currentState = com.pw.quizwhizz.model.game.GameState.EVALUATING_ANSWERS;
        }
    
}