@org.junit.Test
public void koTest2() {
    com.letitgo.Board board = new com.letitgo.Board(9);
    board.loadFromFile("BoardTest_b.dat");
    board.makeMove(new com.letitgo.Point(board, 3, 1), Board.FRIENDLY);
    org.junit.Assert.assertTrue("KO test failed", ((board.checkRules(new com.letitgo.Point(board, 2, 1), Board.ENEMY)) == true));
}