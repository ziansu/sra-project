@org.junit.Test
public void checkRulesTest1() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    Playout pl = new Playout();
    org.junit.Assert.assertTrue("checkRulesTest1 failed", ((pl.checkRules(new Point(5, 2), Board.FRIENDLY, board)) == false));
}