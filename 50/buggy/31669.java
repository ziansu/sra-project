private void updateCapturedPieceViews(java.util.ArrayList<edu.neumont.pro180.chess.core.model.Piece> capturedPieces) {
    for (edu.neumont.pro180.chess.core.view.CapturedPieceView v : capturedPieceViews) {
        v.setCapturedPieces(capturedPieces);
    }
}