private double getMinMax(chess.Piece.Colour pieceColour, double a, double b) {
    if (pieceColour == (chess.Piece.Colour.WHITE)) {
        return java.lang.Math.max(a, b);
    }else {
        return java.lang.Math.min(a, b);
    }
}