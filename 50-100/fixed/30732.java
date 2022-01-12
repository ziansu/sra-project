@org.junit.Test
public void newRun_endRun_Test() {
    Chronotimer c5 = new Chronotimer();
    c5.power();
    assertNull(c5.getCurrentRun());
    assertEquals(true, c5.newRun());
    assertNotNull(c5.getCurrentRun());
    assertTrue(c5.endRun());
    assertNull(c5.getCurrentRun());
}