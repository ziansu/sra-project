public long calculateHash(game.Board board) {
    long hash = 0;
    for (int x = 0; x < (board.getCols()); x++) {
        for (int y = 0; y < (board.getRows()); y++) {
            game.Piece piece = board.getPieceAtPosition(x, y);
            if (piece != null) {
                hash ^= positionValue[y][x][engine.ZobristHashCalculator.getPieceValue(piece)];
            }
        }
    }
    return hash;
}