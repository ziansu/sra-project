private void playerDeath() {
    player.setStatus(0);
    prefs.reset();
    if (genuini.screens.AbstractScreen.connected) {
        genuini.screens.AbstractScreen.arduinoInstance.write("death;");
    }
    music.stopMusic();
    genuini.handlers.ScreenManager.getInstance().showScreen(ScreenEnum.DEATH);
}