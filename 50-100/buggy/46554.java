public void testAddExact() {
    for (int a : com.google.gwt.emultest.java.lang.MathTest.ALL_INTEGER_CANDIDATES) {
        for (int b : com.google.gwt.emultest.java.lang.MathTest.ALL_INTEGER_CANDIDATES) {
            java.math.BigInteger expectedResult = java.math.BigInteger.valueOf(a).add(java.math.BigInteger.valueOf(b));
            boolean expectedSuccess = com.google.gwt.emultest.java.lang.MathTest.fitsInInt(expectedResult);
            try {
                assertEquals((a + b), java.lang.Math.addExact(a, b));
                assertTrue(expectedSuccess);
            } catch (java.lang.ArithmeticException e) {
                assertFalse(expectedSuccess);
            }
        }
    }
}