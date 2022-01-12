@org.junit.Test
public void testDouble() {
    org.junit.Assert.assertEquals(java.lang.Double.valueOf((-3.0)), magic.compiler.Reader.read("-3.0"));
    org.junit.Assert.assertEquals(java.lang.Double.valueOf(3.0E9), magic.compiler.Reader.read(".3e10"));
    org.junit.Assert.assertEquals(java.lang.Double.valueOf((-3.0E9)), magic.compiler.Reader.read("-0.3e10"));
}