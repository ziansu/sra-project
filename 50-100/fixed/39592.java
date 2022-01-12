@java.lang.Override
public void guessingDone(int score) {
    gameManagerInterface.updateScore(java.lang.String.valueOf(score));
    int currentHighScore = com.wbohn.rgblamp.App.getAppPreferences().getHighScore();
    if (score > currentHighScore) {
        com.wbohn.rgblamp.App.getAppPreferences().saveHighScore(score);
        gameManagerInterface.updateHighScore(java.lang.String.valueOf(score));
    }
    advanceGame();
}