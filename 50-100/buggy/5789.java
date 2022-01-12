public void showAvailableSquares(int y, int x) {
    setCheckeredColor();
    Pieces.Piece clickedPiece = myBoard.getPiece(y, x);
    if (clickedPiece != null) {
        getSquare(y, x).setBackground(java.awt.Color.CYAN);
        java.util.List<java.awt.Point> moves = clickedPiece.getAvailableMoves(myBoard.getMyBoardArray());
        for (java.awt.Point point : moves) {
            getSquare(point.y, point.x).setBackground(java.awt.Color.GREEN);
        }
    }
}