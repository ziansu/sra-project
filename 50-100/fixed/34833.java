public java.util.ArrayList<com.letitgo.Point> getAllMoves(final com.letitgo.Board board, int ownStoneType) {
    int boardSize = board.getSize();
    java.util.ArrayList<com.letitgo.Point> points = new java.util.ArrayList<com.letitgo.Point>();
    for (int i = 0; i < boardSize; i++) {
        for (int j = 0; j < boardSize; j++) {
            points.add(new com.letitgo.Point(board, i, j));
        }
    }
    return getCaptureMoves(board, points, ownStoneType, false);
}