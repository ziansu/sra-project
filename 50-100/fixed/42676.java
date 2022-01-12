@org.junit.Test
public void checkRulesTest1() {
    com.letitgo.Board board = new com.letitgo.Board(9);
    board.loadFromFile("BoardTest_a.dat");
    org.junit.Assert.assertTrue("checkRulesTest1 failed", ((board.checkRules(new com.letitgo.Point(board, 5, 2), Board.FRIENDLY)) == false));
}