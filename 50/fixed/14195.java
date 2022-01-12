public void assertEquals(java.lang.String expected, java.lang.String found) {
    logger().log(LogLevel.ASSERTION, ((("Asserting that " + expected) + " equals ") + found));
    org.testng.Assert.assertEquals(expected, found);
}