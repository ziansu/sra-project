protected boolean hasSameOwner(int pieceX, int pieceY) {
    return (this.owner) == (this.board.getFigure(pieceX, pieceY).getOwner());
}