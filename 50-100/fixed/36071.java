@org.junit.Test
public void testSpareCountsNextFrameScore() {
    try {
        game.addThrow(7);
        game.addThrow(3);
        game.addThrow(3);
        game.addThrow(5);
        assertEquals(26, game.getScore());
        assertEquals(18, game.getFrame(1).getValue());
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}