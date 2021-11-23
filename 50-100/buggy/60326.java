public short clickDot(Location loc) {
    this.ChessStatus[loc.getX()][loc.getY()] = factory.makeChess(this.nowPlayer, loc, this.step);
    short winner = this.checkFinish();
    if (winner == (Const.NO_WIN)) {
        this.changePlayer();
        (step)++;
    }
    return winner;
}