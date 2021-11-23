@org.junit.Test
public void testInitialDeal() {
    models.Game g = new models.Game();
    models.User u = new models.User();
    u.hostGame = g;
    u.initialDeal();
    assertEquals(2, g.cols.get(0).size());
}