public void pauseGame() {
    this.paused = true;
    this.application.getInputManager().setCursorVisible(true);
    this.thief.getCamera().setEnabled(false);
    this.thief.stop();
    for (singlePlayer.model.NodeCharacter enemy : enemies)
        ((singlePlayer.model.NodeEnemy) (enemy)).pauseIntelligence();
    
}