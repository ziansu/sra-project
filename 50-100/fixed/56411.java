@org.junit.Test
public void testStrikeCountsNextFrameScores() {
    try {
        game.addThrow(10);
        game.addThrow(3);
        game.addThrow(5);
        game.addThrow(1);
        game.addThrow(4);
        assertEquals(36, game.getScore());
        assertEquals(23, game.getFrame(1).getValue());
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}