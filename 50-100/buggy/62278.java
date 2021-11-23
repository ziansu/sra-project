protected void assertEquals(java.lang.Object actual, java.lang.Object expected, java.lang.String errorMessage) {
    if (!(actual.equals(expected)))
        errorHeppens((((((errorMessage + (NEW_LINE)) + " Wrong assertEquals   actual: ") + actual) + " | expected: ") + expected));
    
    org.testng.Assert.assertEquals(actual, expected);
}