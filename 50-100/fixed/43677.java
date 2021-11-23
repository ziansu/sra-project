@org.junit.Test
public void testGetBubbles() throws java.lang.Exception {
    when(input.isFirePrimaryWeapon()).thenReturn(true);
    when(levelController.getScreenController()).thenReturn(screenController);
    assertSame(player.getBubbles().size(), 0);
    player.processInput();
    assertTrue(((player.getBubbles().size()) > 0));
}