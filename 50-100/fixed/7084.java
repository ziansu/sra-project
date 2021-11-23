public void setup(chess.GameHistory history) {
    this.setup();
    this.history = history;
    for (chess.Move m : this.history.logList) {
        try {
            this.move(m);
        } catch (chess.IllegalMoveException e) {
            java.lang.System.out.println((e + "History is corrupted."));
        }
    }
}