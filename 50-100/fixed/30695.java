@org.junit.Test
public void testProcessInputNotDeadGetDs() throws java.lang.Exception {
    when(input.isMoveDown()).thenReturn(true);
    when(input.isMoveLeft()).thenReturn(true);
    assertEquals(0.0, player.getDy());
    assertEquals(0.0, player.getDx());
}