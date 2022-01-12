@org.junit.Test
public void testOneThrow() {
    try {
        game.addThrow(7);
        assertEquals(game.getScore(), 7);
    } catch (java.lang.Exception e) {
        assertFalse(((e.getMessage()) + " should not have thrown exception here"), true);
    }
}