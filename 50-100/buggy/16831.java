private void gameOver() {
    notifyOrientationListeners();
    notifyScoreListeners();
    if (isHighScore()) {
        this.highScore = score;
        java.lang.System.out.println(("High:" + (this.highScore)));
        writeHighScore(this.highScore);
    }
    stop();
}