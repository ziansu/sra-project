@org.junit.Test
public void dnf_on_empty_run_Test() {
    Chronotimer c0 = new Chronotimer();
    c0.power();
    c0.toggleChannel("1");
    c0.toggleChannel("2");
    c0.newRun();
    c0.num("111");
    assertEquals(false, c0.dnf());
}