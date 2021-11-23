@java.lang.Override
public void onGameOver(boolean lost) {
    gameOver = true;
    gameThread.stopGame();
    showGameOverDialog(R.string.lose);
}