public void moveTo(cs242.chess.ChessSpace newSpace) {
    cs242.chess.pieces.ChessPiece targetPiece = newSpace.getPiece();
    if (targetPiece != null) {
        newSpace.getPiece().setSpace(null);
    }
    newSpace.setPiece(this);
    getSpace().setPiece(null);
    setSpace(newSpace);
}