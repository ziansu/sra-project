@org.junit.Test
public void testTwoThrows() {
    try {
        game.addThrow(7);
        game.addThrow(2);
        assertEquals(4, game.getScore());
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}