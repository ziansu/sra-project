public void testIncrementExactLong() {
    for (long a : com.google.gwt.emultest.java.lang.MathTest.ALL_LONG_CANDIDATES) {
        java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).add(java.math.BigInteger.ONE);
        boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInLong(expectedResult);
        try {
            assertEquals((a + 1), java.lang.Math.incrementExact(a));
            assertTrue(expectedSuccess);
        } catch (java.lang.ArithmeticException e) {
            assertFalse(expectedSuccess);
        }
    }
}