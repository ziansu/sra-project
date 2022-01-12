@org.junit.Test
public void testGameEndVertical() {
    Board board = new Board(10);
    Referee referee = new Referee(board);
    org.junit.Assert.assertFalse(referee.isGameEnded());
    for (int i = 0; i < 5; i++) {
        board.fill(new Coordinate(0, i), FieldValue.P1);
    }
    org.junit.Assert.assertTrue(referee.isGameEnded());
}