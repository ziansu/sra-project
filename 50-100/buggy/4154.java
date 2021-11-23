public static java.util.Collection<Piece> calculateActivePieces(final java.util.List<Tile> gameBoard, final Alliance alliance) {
    final java.util.List<Piece> activePieces = new java.util.ArrayList<>();
    for (Tile tile : gameBoard) {
        if (tile.isTileOccupied()) {
            final Piece piece = tile.getPiece();
            if ((piece.getPieceAlliance()) == alliance) {
                activePieces.add(piece);
            }
        }
    }
    return activePieces;
}