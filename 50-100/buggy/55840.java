public void updateCurrentPiece(com.chess.ui.Location location) {
    com.chess.ui.Location oldLocation = com.chess.ui.BoardModel.currentPiece.location;
    com.chess.ui.BoardModel.chessBoard[oldLocation.row][oldLocation.column] = null;
    com.chess.ui.BoardModel.currentPiece.location = location;
    com.chess.ui.BoardModel.chessBoard[location.row][location.column] = com.chess.ui.BoardModel.currentPiece;
    if ((com.chess.ui.BoardModel.currentPiece.id) == (com.chess.ui.BoardModel.PAWN)) {
        com.chess.pieces.Pawn pawn = ((com.chess.pieces.Pawn) (com.chess.ui.BoardModel.currentPiece));
        pawn.setIsMoved(true);
    }
    com.chess.ui.BoardModel.currentPiece = null;
}