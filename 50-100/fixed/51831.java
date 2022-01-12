@org.junit.Test
public void testStrikeMovesToNextFrame() {
    try {
        assertEquals(1, game.getCurrentFrame());
        game.addThrow(10);
        assertEquals(2, game.getCurrentFrame());
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}