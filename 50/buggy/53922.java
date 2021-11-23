public void startNewGame() {
    gameView.startNewGameThread();
    gameView.simplePlayGround.start();
    gameView.invalidate();
}