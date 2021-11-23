public void setup(chess.GameHistory history) {
    this.history = history;
    this.setup();
    for (chess.Move m : this.history.logList) {
        try {
            this.move(m);
        } catch (chess.IllegalMoveException e) {
            java.lang.System.out.println((e + "History is corrupted."));
        }
    }
}