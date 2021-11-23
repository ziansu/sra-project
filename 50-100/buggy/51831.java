@org.junit.Test
public void testStrikeMovesToNextFrame() {
    try {
        assertEquals(game.getCurrentFrame(), 1);
        game.addThrow(10);
        assertEquals(game.getCurrentFrame(), 2);
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}