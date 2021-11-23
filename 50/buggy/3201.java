private int getMinMax(chess.Piece.Colour pieceColour, int a, int b) {
    if (pieceColour == (chess.Piece.Colour.WHITE)) {
        return java.lang.Math.max(a, b);
    }else {
        return java.lang.Math.min(a, b);
    }
}