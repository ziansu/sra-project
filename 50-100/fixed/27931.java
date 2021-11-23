@org.junit.Test
public void koTest() {
    com.letitgo.Board board = new com.letitgo.Board(9);
    board.loadFromFile("BoardTest_a.dat");
    board.removeDeadStones(Board.FRIENDLY);
    board.removeDeadStones(Board.ENEMY);
    board.setPoint(8, 6, Board.ENEMY);
    board.removeDeadStones(Board.FRIENDLY);
    org.junit.Assert.assertTrue("KO test failed", ((board.checkRules(new com.letitgo.Point(board, 8, 7), Board.FRIENDLY)) == false));
}