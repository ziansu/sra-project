@org.junit.Test
public void testRoll() throws java.lang.Exception {
    Objects.Dice dice = new Objects.Dice();
    assertTrue((((dice.roll()) > 0) || ((dice.roll()) < 7)));
}