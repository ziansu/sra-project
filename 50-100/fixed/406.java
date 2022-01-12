public void testMultiplyExactLongs() {
    for (long a : com.google.gwt.emultest.java.lang.MathTest.ALL_LONG_CANDIDATES) {
        for (long b : com.google.gwt.emultest.java.lang.MathTest.ALL_LONG_CANDIDATES) {
            java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).multiply(java.math.BigInteger.valueOf(b));
            boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInLong(expectedResult);
            try {
                com.google.gwt.emultest.java.lang.MathTest.assertEquals((a * b), java.lang.Math.multiplyExact(a, b));
                assertTrue(expectedSuccess);
            } catch (java.lang.ArithmeticException e) {
                assertFalse(expectedSuccess);
            }
        }
    }
}