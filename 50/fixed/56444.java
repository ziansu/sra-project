private void nextProblem() {
    correctAnswer = problems.get(currentProblem).getAnswer();
    (currentProblem)++;
    tries = 0;
    response = "";
}