public final void stop() {
    gamelogic.Logger.logMessage(LogMessage.GameStop);
    board.setScore(0);
    try {
        java.nio.file.Files.write(highscorePath, java.lang.String.valueOf(board.getHighScore()).getBytes("UTF-8"));
        gamelogic.Logger.logMessage(LogMessage.HighscoreSaved);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    gamelogic.Logger.saveLog();
}