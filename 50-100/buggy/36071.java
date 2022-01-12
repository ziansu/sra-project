@org.junit.Test
public void testSpareCountsNextFrameScore() {
    try {
        game.addThrow(7);
        game.addThrow(3);
        game.addThrow(3);
        game.addThrow(5);
        assertEquals(game.getScore(), 26);
        assertEquals(game.getFrame(1).getValue(), 18);
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}