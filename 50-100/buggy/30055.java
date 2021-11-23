public com.letitgo.Point getFirstMove(com.letitgo.Board board) {
    java.util.ArrayList<com.letitgo.Point> points = new java.util.ArrayList<com.letitgo.Point>();
    points = com.letitgo.Playout.getNeighbours(board, board.getLastPoint());
    points.addAll(com.letitgo.Playout.getDiagonalNeighbours(board, board.getLastPoint()));
    return getPatternMove(board, points);
}