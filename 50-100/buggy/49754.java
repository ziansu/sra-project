@org.junit.Test
public void testMove() throws java.lang.Exception {
    org.mockito.Mockito.when(input.isMoveLeft()).thenReturn(true);
    player.processInput();
    player.move();
    assertEquals(((-(Settings.PLAYER_SPEED)) + (Level.SPRITE_SIZE)), player.getX());
    assertEquals(((Level.SPRITE_SIZE) - (player.calculateGravity())), player.getY());
}