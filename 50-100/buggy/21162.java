@org.junit.Test
public void DNF_Test() {
    Chronotimer c8 = new Chronotimer();
    c8.power();
    c8.toggleChannel("1");
    c8.toggleChannel("2");
    c8.newRun();
    c8.num("111");
    assertEquals(true, c8.start());
    assertEquals(true, c8.dnf());
    c8.endRun();
    c8.power();
}