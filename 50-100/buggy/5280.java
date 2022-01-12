@Test
public void testGetScoreLessThan23() {
    DiceGame game = new DiceGame();
    try {
        int total = game.roll(3);
        int score = 23 - total;
        assertEquals(score, game.getScore());
    } catch (RollAfterGameOverException e) {
        fail();
    }
}