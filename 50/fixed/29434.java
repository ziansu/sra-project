public boolean opponentMove(player.Move m) {
    if (this.currentBoard.isValidMove(humanColor, m)) {
        this.currentBoard.move(m, humanColor);
        return true;
    }
    return false;
}