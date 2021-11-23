public void testDecrementExact() {
    for (int a : com.google.gwt.emultest.java.lang.MathTest.ALL_INTEGER_CANDIDATES) {
        java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).subtract(java.math.BigInteger.ONE);
        boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInInt(expectedResult);
        try {
            com.google.gwt.emultest.java.lang.MathTest.assertEquals((a - 1), java.lang.Math.decrementExact(a));
            assertTrue(expectedSuccess);
        } catch (java.lang.ArithmeticException e) {
            assertFalse(expectedSuccess);
        }
    }
}