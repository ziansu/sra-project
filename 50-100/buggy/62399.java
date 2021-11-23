@org.junit.Test
public void testProgressLookCommandWithNoItem() {
    Map m = mock(Map.class);
    Player p = mock(Player.class);
    when(m.getStartingRoom()).thenReturn(rNorth);
    Game g = new Game(m, p);
    java.lang.String res = g.progress("l");
    assertTrue(res.contains("You see nothing"));
    verify(p, times(0)).acquireItem(any());
}