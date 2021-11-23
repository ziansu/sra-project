public net.alexblass.chess.models.Piece getKing(int color) {
    net.alexblass.chess.models.Piece king = null;
    java.util.List<net.alexblass.chess.models.Piece> playerPieces;
    if (color == (net.alexblass.chess.models.Piece.WHITE)) {
        playerPieces = mWhitePieces;
    }else {
        playerPieces = mBlackPieces;
    }
    for (int i = 0; i < (playerPieces.size()); i++) {
        if ((playerPieces.get(i).getName()) == (net.alexblass.chess.models.Piece.KING)) {
            king = playerPieces.get(i);
        }
    }
    return king;
}