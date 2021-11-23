@org.junit.Test
public void isFriendlySingleEyePointTest() {
    Board board = new Board(9);
    board.loadFromFile("board9x9_1.dat");
    Playout pl = new Playout();
    org.junit.Assert.assertFalse("isFriendlySingleEyePoint failed", ((pl.isFriendlySingleEyePoint(new Point(5, 2), Board.ENEMY, board)) == false));
}