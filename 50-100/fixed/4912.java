@org.junit.Test
public void testHashCode() throws java.lang.Exception {
    final com.pi4j.io.w1.W1Device w1Devicea1 = createDevice("28-00000698ebb1");
    final com.pi4j.io.w1.W1Device w1Devicea2 = createDevice("28-00000698ebb1");
    assertEquals(w1Devicea1.hashCode(), w1Devicea2.hashCode());
    final com.pi4j.io.w1.W1Device w1Deviceb = createDevice("28-00000698ebb2");
    assertNotEquals(w1Devicea1.hashCode(), w1Deviceb.hashCode());
}