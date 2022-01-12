@java.lang.Override
public boolean isInCheck() {
    for (Piece enemy : this.opponentsPieces) {
        if (!(enemy.isKing)) {
            if (enemy.checkPossibleMoves().contains(Chess.board.spaces[this.getLY()][this.getLX()])) {
                return true;
            }
        }
    }
    return false;
}