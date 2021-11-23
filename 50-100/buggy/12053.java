@org.junit.Test
public void testCollisionUp() throws java.lang.Exception {
    org.mockito.Mockito.when(input.isMoveUp()).thenReturn(true);
    org.mockito.Mockito.when(levelController.causesCollision(org.mockito.Mockito.any(java.lang.Double.class), org.mockito.Mockito.any(java.lang.Double.class), org.mockito.Mockito.any(java.lang.Double.class), org.mockito.Mockito.any(java.lang.Double.class))).thenReturn(true);
    player.processInput();
    player.move();
    assertEquals(Level.SPRITE_SIZE, player.getY());
}