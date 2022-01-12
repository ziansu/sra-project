@org.junit.Test
public void testMoveRight() throws java.lang.Exception {
    org.mockito.Mockito.when(input.isMoveRight()).thenReturn(true);
    assertEquals(0.0, player.getX());
    player.processInput();
    player.move();
    assertEquals(((Settings.PLAYER_SPEED) + (Level.SPRITE_SIZE)), player.getX());
}