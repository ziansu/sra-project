@org.junit.Test
public void removeDeadStonesTest2() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    int point = board.getPoint(0, 0);
    Playout pl = new Playout();
    pl.removeDeadStones(board, Board.FRIENDLY);
    org.junit.Assert.assertFalse("removeDeadStonesTest2 failed", (point == (Board.EMPTY)));
}