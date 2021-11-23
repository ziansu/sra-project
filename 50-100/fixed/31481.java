public long calculateHash(game.Board board) {
    long hash = 0;
    for (int x = 0; x < (board.getRows()); x++) {
        for (int y = 0; y < (board.getCols()); y++) {
            game.Piece piece = board.getPieceAtPosition(x, y);
            if (piece != null) {
                hash ^= positionValue[x][y][engine.ZobristHashCalculator.getPieceValue(piece)];
            }
        }
    }
    return hash;
}