@org.junit.Test
public void testSetScore() {
    gamelogic.Board board = new gamelogic.Board();
    int score = board.getScore();
    board.setScore((score + 30));
    org.junit.Assert.assertTrue(((board.getScore()) == (score + 30)));
}