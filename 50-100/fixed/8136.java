public java.util.List<core.moves.Move> getLastNMoves(int n) {
    java.util.List<core.moves.Move> moves = new java.util.ArrayList(this.moveHistory);
    java.util.Collections.reverse(moves);
    if ((n > 0) && (n < (this.moveHistory.size())))
        moves = moves.subList(0, n);
    
    return moves;
}