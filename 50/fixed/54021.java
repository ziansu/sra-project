@java.lang.Override
public void onGameOver(boolean lost) {
    gameOver = 1;
    gameThread.stopGame();
    showGameOverDialog(R.string.lose);
}