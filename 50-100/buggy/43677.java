@org.junit.Test
public void testGetBubbles() throws java.lang.Exception {
    org.mockito.Mockito.when(input.isFirePrimaryWeapon()).thenReturn(true);
    org.mockito.Mockito.when(levelController.getScreenController()).thenReturn(screenController);
    assertSame(player.getBubbles().size(), 0);
    player.processInput();
    assertTrue(((player.getBubbles().size()) > 0));
}