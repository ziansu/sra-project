@Test
public void testGetScoreLessThan23() {
    DiceGame game = new DiceGame();
    try {
        int total = game.roll(3);
        assertEquals(total, game.getScore());
    } catch (RollAfterGameOverException e) {
        fail();
    }
}