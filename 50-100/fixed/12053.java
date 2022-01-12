@org.junit.Test
public void testCollisionUp() throws java.lang.Exception {
    when(input.isMoveUp()).thenReturn(true);
    when(levelController.causesCollision(any(java.lang.Double.class), any(java.lang.Double.class), any(java.lang.Double.class), any(java.lang.Double.class))).thenReturn(true);
    player.processInput();
    player.move();
    assertEquals(Level.SPRITE_SIZE, player.getY());
}