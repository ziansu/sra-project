public void pauseGame() {
    this.paused = true;
    this.application.getInputManager().setCursorVisible(true);
    this.thief.stop();
    this.thief.getCamera().setEnabled(false);
    for (singlePlayer.model.NodeCharacter enemy : enemies)
        ((singlePlayer.model.NodeEnemy) (enemy)).pauseIntelligence();
    
}