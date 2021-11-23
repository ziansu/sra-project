public void setScore(int score) {
    if ((this.score) != score) {
        this.score = score;
    }
    setHighScore(java.lang.Math.max(getHighScore(), getScore()));
}