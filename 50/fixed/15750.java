private void checkSwitch() {
    com.mygdx.magicappgame.levels.Level whichLevel = whichLevel();
    if (whichLevel != null) {
        refresh();
        game.playScreen.setCurrentLevel(whichLevel);
        game.setScreen(game.playScreen);
    }
}