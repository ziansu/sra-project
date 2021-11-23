@java.lang.Override
public boolean isInCheck() {
    for (Piece enemy : this.opponentsPieces) {
        if (!(enemy.isKing)) {
            if (enemy.checkPossibleMoves().contains(Chess.board.spaces[this.getLY()][this.getLX()])) {
                java.lang.System.out.println(enemy);
                java.lang.System.out.println(this.opponentsPieces);
                return true;
            }
        }
    }
    return false;
}