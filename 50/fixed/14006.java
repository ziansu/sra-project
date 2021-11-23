@java.lang.Override
public void onFinish() {
    boolean gameNotOver = addLetter(currentPlayer);
    if (gameNotOver) {
        roundEndDialog("Time's Up!");
    }else {
        endGame();
    }
    if ((timer) != null) {
        timer.cancel();
    }
}