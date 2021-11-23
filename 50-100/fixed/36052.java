@java.lang.Override
public void run() {
    while (!(finished)) {
        nextMove();
        if ((lastMove) != null) {
            board.receiveMove(lastMove, playerTurn);
        }
        playerTurn = !(playerTurn);
        checkWinSituation();
    } 
    try {
        java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}