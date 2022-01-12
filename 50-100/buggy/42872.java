@org.junit.Test
public void removeDeadStonesTest1() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    int firstPoint = board.getPoint(2, 6);
    int secondPoint = board.getPoint(3, 6);
    Playout pl = new Playout();
    pl.removeDeadStones(board, Board.ENEMY);
    org.junit.Assert.assertFalse("removeDeadStonesTest1 failed", ((firstPoint == (Board.EMPTY)) && (secondPoint == (Board.EMPTY))));
}