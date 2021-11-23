@java.lang.Override
public void guessingDone(int score) {
    gameManagerInterface.updateScore(java.lang.String.valueOf(score));
    int currentHighScore = com.wbohn.rgblamp.App.getAppPreferences().getHighScore();
    if (score > currentHighScore) {
        gameManagerInterface.updateHighScore(java.lang.String.valueOf(score));
        com.wbohn.rgblamp.App.getAppPreferences().saveHighScore(score);
    }
    advanceGame();
}