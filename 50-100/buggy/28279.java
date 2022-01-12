public void testNegateExact() {
    for (int a : com.google.gwt.emultest.java.lang.MathTest.ALL_INTEGER_CANDIDATES) {
        java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).negate();
        boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInInt(expectedResult);
        try {
            assertEquals((-a), java.lang.Math.negateExact(a));
            assertTrue(expectedSuccess);
        } catch (java.lang.ArithmeticException e) {
            assertFalse(expectedSuccess);
        }
    }
}