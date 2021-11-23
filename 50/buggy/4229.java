@org.junit.Test
public void testGetScore() {
    gamelogic.Board board = new gamelogic.Board();
    board.setScore(30);
    org.junit.Assert.assertTrue(((board.getScore()) == 30));
}