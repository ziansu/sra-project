public int setCurrent(tetrismyownafterlossingoriginalfilesandgithubisamess.Piece piece, int x, int y) {
    int result = board.place(piece, x, y);
    if (result <= (Board.PLACE_ROW_FILLED)) {
        if ((currentPiece) != null) {
            repaintPiece(currentPiece, currentX, currentY);
        }
        currentPiece = piece;
        currentX = x;
        currentY = y;
        repaintPiece(currentPiece, currentX, currentY);
    }else {
        board.undo();
    }
    return result;
}