@org.junit.Test
public void removeDeadStonesTest2() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    int point;
    Playout pl = new Playout();
    pl.removeDeadStones(board, Board.FRIENDLY);
    point = board.getPoint(0, 0);
    org.junit.Assert.assertTrue("removeDeadStonesTest2 failed", (point == (Board.EMPTY)));
}