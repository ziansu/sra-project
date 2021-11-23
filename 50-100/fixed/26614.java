@org.junit.Test
public void checkRulesTest2() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    Playout pl = new Playout();
    org.junit.Assert.assertTrue("checkRulesTest2 failed", ((pl.checkRules(new Point(0, 8), Board.FRIENDLY, board)) == false));
}