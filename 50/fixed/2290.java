@org.junit.Test
public void testNaN() {
    org.junit.Assert.assertEquals(0, java.lang.Double.compare(java.lang.Double.NaN, java.lang.Double.NaN), 0);
}