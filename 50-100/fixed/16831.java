private void gameOver() {
    notifyOrientationListeners();
    stop();
    if (isHighScore()) {
        this.highScore = score;
        java.lang.System.out.println(("High:" + (this.highScore)));
        writeHighScore(this.highScore);
    }
    notifyScoreListeners();
}