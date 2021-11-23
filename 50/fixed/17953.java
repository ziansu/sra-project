public static void destroyInstance() {
    lasersharks.HighScores.INSTANCE.highScoreList = null;
    lasersharks.HighScores.INSTANCE.inputFile = lasersharks.HighScores.HIGH_SCORE_FILE_URI;
    lasersharks.HighScores.INSTANCE.score = 0;
}