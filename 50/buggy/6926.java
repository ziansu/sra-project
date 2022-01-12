@org.junit.Test
public void testMouseXpos() {
    assertNotNull(GameHUD.getMouseXpos());
    assertEquals(GameHUD.mouseXpos, GameHUDTest.mouseXpos);
}