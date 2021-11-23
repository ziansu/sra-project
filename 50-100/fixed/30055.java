public com.letitgo.Point getFirstMove(com.letitgo.Board board) {
    java.util.ArrayList<com.letitgo.Point> points = new java.util.ArrayList<com.letitgo.Point>();
    points = board.getLastPoint().getNeighbours();
    points.addAll(board.getLastPoint().getDiagonalNeighbours());
    return getPatternMove(board, points);
}