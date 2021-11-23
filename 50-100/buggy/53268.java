public boolean setHighscore(com.tann.hexcity.screens.gameScreen.GameScreen.GameType type, int score) {
    int prevScore = getHighScore(type);
    if (prevScore >= score)
        return false;
    
    java.lang.System.out.println("showing notif");
    if (prevScore != 0)
        com.tann.hexcity.screens.gameScreen.GameScreen.get().newNotification.add(new com.tann.hexcity.screens.gameScreen.ui.HighscoreIcon(type, prevScore, score));
    
    data.putInteger(("highscore" + (type.toString())), score);
    data.flush();
    return true;
}