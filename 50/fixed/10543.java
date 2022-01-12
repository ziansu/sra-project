protected boolean hasSameOwner(int pieceX, int pieceY) {
    return (owner) == (board.getFigure(pieceX, pieceY).getOwner());
}