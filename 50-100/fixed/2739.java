public void testNegateExactLong() {
    for (long a : com.google.gwt.emultest.java.lang.MathTest.ALL_LONG_CANDIDATES) {
        java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).negate();
        boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInLong(expectedResult);
        try {
            com.google.gwt.emultest.java.lang.MathTest.assertEquals((-a), java.lang.Math.negateExact(a));
            assertTrue(expectedSuccess);
        } catch (java.lang.ArithmeticException e) {
            assertFalse(expectedSuccess);
        }
    }
}