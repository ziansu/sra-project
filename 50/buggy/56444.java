private void nextProblem() {
    this.correctAnswer = this.problems.get(this.currentProblem).getAnswer();
    ++(this.currentProblem);
    this.tries = 0;
    this.response = "";
}