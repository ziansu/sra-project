@org.junit.Test
public void Runs_Test1() {
    Chronotimer c7 = new Chronotimer();
    c7.power();
    c7.toggleChannel("1");
    c7.toggleChannel("2");
    assertEquals(true, c7.newRun());
    assertEquals(true, c7.num("111"));
    assertEquals(true, c7.start());
    assertEquals(true, c7.finish());
}