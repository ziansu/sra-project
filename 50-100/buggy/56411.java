@org.junit.Test
public void testStrikeCountsNextFrameScores() {
    try {
        game.addThrow(10);
        game.addThrow(3);
        game.addThrow(5);
        game.addThrow(1);
        game.addThrow(4);
        assertEquals(game.getScore(), 36);
        assertEquals(game.getFrame(1).getValue(), 23);
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}