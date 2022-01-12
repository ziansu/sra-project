@com.laboon.Test
public void testMovementSouth() {
    com.laboon.Player mockPlayer = org.mockito.Mockito.Mockito.mock(com.laboon.Player.class);
    com.laboon.House mockHouse = org.mockito.Mockito.Mockito.mock(com.laboon.House.class);
    com.laboon.Game gameTester = new com.laboon.Game(mockPlayer, mockHouse);
    mockPlayer.when(mockPlayer.drink());
    thenReturn(true);
    assertEquals(gameTester.doSomething("d"), 1);
    assertEquals(gameTester.doSomething("D"), 1);
}