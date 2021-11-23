@org.junit.Test
public void koTest() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    Playout pl = new Playout();
    board.setPoint(8, 6, Board.ENEMY);
    pl.removeDeadStones(board, Board.FRIENDLY);
    java.lang.System.out.printf("[%d %d]", board.koPoint.i, board.koPoint.j);
    org.junit.Assert.assertFalse("KO test failed", ((pl.checkRules(new Point(8, 7), Board.FRIENDLY, board)) == true));
}