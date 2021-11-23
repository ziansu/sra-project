public void testIncrementExact() {
    for (int a : com.google.gwt.emultest.java.lang.MathTest.ALL_INTEGER_CANDIDATES) {
        java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).add(java.math.BigInteger.ONE);
        boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInInt(expectedResult);
        try {
            assertEquals((a + 1), java.lang.Math.incrementExact(a));
            assertTrue(expectedSuccess);
        } catch (java.lang.ArithmeticException e) {
            assertFalse(expectedSuccess);
        }
    }
}