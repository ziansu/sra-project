public void reset() {
    java.lang.System.out.println("RESTART! RESTART!");
    swimmer.restart();
    oxygenMeter.restart();
    staminaMeter.restart();
    timer.restart();
    Gdx.input.setInputProcessor(this);
    gameOverOverlay.setVisible(false);
    pauseOverlay.setVisible(false);
    winOverlay.setVisible(false);
    gameOver = false;
    goingRight = false;
    goingLeft = false;
    paused = false;
    this.gameState = com.cpioli.headabovewater.screens.GameScreen.GAME_PLAY;
}