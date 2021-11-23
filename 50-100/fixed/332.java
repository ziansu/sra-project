private boolean canMoveOrCapture(int x, int y, boolean result, checkers61b.Piece piece, int side) {
    int direction = getDirection(side);
    if (((piece == null) && ((java.lang.Math.abs((x - (selectedPieceX)))) == 1)) && ((y - (selectedPieceY)) == (1 * direction))) {
        result = true;
    }
    result = canCapture(x, y, result, piece, side);
    return result;
}