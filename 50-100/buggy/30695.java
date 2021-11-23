@org.junit.Test
public void testProcessInputNotDeadGetDs() throws java.lang.Exception {
    org.mockito.Mockito.when(input.isMoveDown()).thenReturn(true);
    org.mockito.Mockito.when(input.isMoveLeft()).thenReturn(true);
    assertEquals(0.0, player.getDy());
    assertEquals(0.0, player.getDx());
}