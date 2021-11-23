private boolean pieceAtOriginIs(basics.Move move, char piece) {
    return this.pieceAtSquareIs(move.getOriginRow(), move.getOriginCol(), piece);
}