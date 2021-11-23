@org.junit.Test
public void testSetScore() {
    final int num = 30;
    gamelogic.Board board = new gamelogic.Board();
    int score = board.getScore();
    board.setScore((score + num));
    org.junit.Assert.assertTrue(((board.getScore()) == (score + num)));
}