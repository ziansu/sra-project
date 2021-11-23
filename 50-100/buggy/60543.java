@org.junit.Test
public void testKeyReleasedRight() {
    game.setPressedRight(true);
    org.junit.Assert.assertTrue(game.getRightPressed());
    final java.awt.event.KeyEvent key = new java.awt.event.KeyEvent(game, 0, java.lang.System.currentTimeMillis(), 0, java.awt.event.KeyEvent.VK_RIGHT, java.awt.event.KeyEvent.CHAR_UNDEFINED);
    game.keyReleased(key);
    org.junit.Assert.assertFalse(game.getRightPressed());
}