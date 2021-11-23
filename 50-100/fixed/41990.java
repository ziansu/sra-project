@org.junit.Test
public void testSin() {
    m.addToEntry("0");
    m.enterValue();
    m.enterHistory();
    assertEquals(m.sin(), "0");
    m.reset();
    m.addToEntry("0");
    assertEquals(m.sin(), "0");
    m.reset();
    m.addToEntry("1.5");
    assertEquals(m.sin(), "0.9974949866040544");
    m.reset();
}