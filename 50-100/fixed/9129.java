public static boolean hasFallingPieces(final java.util.List<com.gamesbykevin.yoshi.board.piece.Piece> pieces) {
    for (int i = 0; i < (pieces.size()); i++) {
        final com.gamesbykevin.yoshi.board.piece.Piece piece = pieces.get(i);
        if (((piece.isPlaced()) || (piece.isDestroyed())) || (piece.isFrozen()))
            continue;
        
        return true;
    }
    return false;
}