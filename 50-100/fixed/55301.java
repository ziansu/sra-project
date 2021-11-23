private void gameOver() {
    reggie.getTimeline().reset();
    ronnie.getTimeline().reset();
    ronnie.SetBonusCounter(0);
    reggie.SetBonusCounter(0);
    changeBroButton.setDisabled(false);
    screenProcesser.setGameOverScreen();
    game.playSound(gameOverSound);
    layoutMusic.stop();
}