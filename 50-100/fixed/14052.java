@org.junit.Test
public void koTest() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    Playout pl = new Playout();
    pl.removeDeadStones(board, Board.FRIENDLY);
    pl.removeDeadStones(board, Board.ENEMY);
    board.setPoint(8, 6, Board.ENEMY);
    pl.removeDeadStones(board, Board.FRIENDLY);
    org.junit.Assert.assertTrue("KO test failed", ((pl.checkRules(new Point(8, 7), Board.FRIENDLY, board)) == false));
}