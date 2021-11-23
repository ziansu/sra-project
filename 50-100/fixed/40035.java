public void testFastInvSqrt() throws java.lang.Exception {
    java.math.BigDecimal slow = new java.math.BigDecimal((1 / (java.lang.Math.sqrt(2))));
    java.math.BigDecimal fast = new java.math.BigDecimal(2);
    java.math.MathContext mc = new java.math.MathContext(3);
    assertEquals(slow.round(mc), fast.round(mc));
}