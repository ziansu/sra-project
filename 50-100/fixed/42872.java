@org.junit.Test
public void removeDeadStonesTest1() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    int firstPoint;
    int secondPoint;
    Playout pl = new Playout();
    pl.removeDeadStones(board, Board.ENEMY);
    firstPoint = board.getPoint(2, 6);
    secondPoint = board.getPoint(3, 6);
    org.junit.Assert.assertTrue("removeDeadStonesTest1 failed", ((firstPoint == (Board.EMPTY)) && (secondPoint == (Board.EMPTY))));
}