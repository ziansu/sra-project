@org.junit.Test
public void checkRulesTest2() {
    com.letitgo.Board board = new com.letitgo.Board(9);
    board.loadFromFile("BoardTest_a.dat");
    org.junit.Assert.assertTrue("checkRulesTest2 failed", ((board.checkRules(new com.letitgo.Point(board, 0, 8), Board.FRIENDLY)) == false));
}