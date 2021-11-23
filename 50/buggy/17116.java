public java.lang.String startOverAction() {
    java.util.Collections.shuffle(this.problems);
    this.currentProblem = 0;
    this.score = 0;
    this.tries = 0;
    this.response = "";
    return "startOver";
}