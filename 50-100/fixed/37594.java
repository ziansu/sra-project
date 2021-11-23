@org.junit.Test
public void testProcessInputNotDeadGetXY() throws java.lang.Exception {
    when(input.isMoveDown()).thenReturn(true);
    when(input.isMoveLeft()).thenReturn(true);
    player.processInput();
    assertEquals((-(Settings.PLAYER_SPEED)), player.getDx());
    assertEquals(0.0, player.getDy());
    assertEquals(Level.SPRITE_SIZE, player.getX());
    assertEquals(Level.SPRITE_SIZE, player.getY());
}