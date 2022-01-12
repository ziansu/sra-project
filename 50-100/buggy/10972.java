@org.junit.Test
public void add_same_num_Test() {
    Chronotimer c0 = new Chronotimer();
    c0.power();
    c0.newRun();
    assertEquals(true, c0.num("12"));
    assertEquals(false, c0.num("12"));
}