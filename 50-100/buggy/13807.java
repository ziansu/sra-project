@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        if ((running) && (hu.hajba.gol.gui.GameBoard.containsLiveCell(board))) {
            board.nextRound();
            updateBoard();
        }
    } 
}