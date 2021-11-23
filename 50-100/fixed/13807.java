@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(500);
        } catch (final java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        if ((this.running) && (hu.hajba.gol.gui.GameBoard.containsLiveCell(this.board))) {
            this.board.nextRound();
            updateBoard();
        }
    } 
}