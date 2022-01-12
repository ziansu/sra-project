private void pieceDropped() {
    if (!(isFallingFinished)) {
        for (int i = 0; i < 4; ++i) {
            int x = (curX) + (curPiece.x(i));
            int y = (curY) - (curPiece.y(i));
            board[((y * (BoardWidth)) + x)] = curPiece.getBlockType();
        }
        removeFullLines();
        newPiece();
    }
}