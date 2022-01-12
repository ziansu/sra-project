@org.junit.Test
public void testThreeThrows() {
    try {
        game.addThrow(7);
        game.addThrow(2);
        game.addThrow(3);
        assertEquals(12, game.getScore());
    } catch (java.lang.Exception e) {
        assertFalse("should not have thrown exception here", true);
    }
}