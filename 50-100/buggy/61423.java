@org.junit.Ignore
@org.junit.Test
public void testEquals() throws java.lang.Exception {
    final com.pi4j.io.w1.W1Device w1Devicea1 = createDevice("28-00000698ebb1");
    final com.pi4j.io.w1.W1Device w1Devicea2 = createDevice("28-00000698ebb2");
    assertTrue(w1Devicea1.equals(w1Devicea2));
    final com.pi4j.io.w1.W1Device w1Deviceb = createDevice("28-00000698ebb2");
    assertFalse(w1Devicea1.equals(w1Deviceb));
    assertFalse(w1Devicea1.equals(null));
    assertFalse(w1Devicea1.equals("123"));
}