public void makeMove(int col, int row, tp.pr5.logic.Counter colour) {
    tp.pr5.logic.Move move = this.factory.createMove(col, row, colour);
    this.game.executeMove(move);
}