public void subFromCurrentScore(int score) {
    if (!(((currentScore) - score) < 0)) {
        this.currentScore -= score;
    }
}