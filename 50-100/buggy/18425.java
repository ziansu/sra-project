public int dropPiece(Piece piece) {
    int scoreDiff = 0;
    if ((piece.dropped) == false) {
        piece.dropped = true;
        BoardCoord[] dropLoc = piece.getDropLoc();
        piece.updateCoords(dropLoc);
        boolean flag = updateBoard(piece);
        if (!flag) {
            return -999;
        }
        if (flag) {
            scoreDiff = checkRowsForFull(piece);
        }
    }
    return scoreDiff;
}