protected void checkForHighScore() {
    cs48.project.game.Space_Blasters.HighScores hs = new cs48.project.game.Space_Blasters.HighScores();
    long[] scoreList = hs.getScoreList();
    for (int i = 0; i < 10; i++) {
        if ((rm.getMainPlayer().getScore()) > (scoreList[i])) {
            writeNewHighScore(hs, i);
        }
    }
}