private static void assertPositiveZero(double x) {
    com.google.gwt.emultest.java.lang.MathTest.assertEquals(0.0, x);
    assertFalse(com.google.gwt.emultest.java.lang.MathTest.isNegativeZero(x));
}