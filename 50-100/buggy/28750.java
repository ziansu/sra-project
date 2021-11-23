public static void assertEqualBeans(java.lang.Object expected, java.lang.Object actual) throws org.junit.ComparisonFailure {
    final java.lang.String expectedAsText = new ch.vorburger.xtendbeans.XtendBeanGenerator().getExpression(expected);
    final java.lang.String actualAsText = new ch.vorburger.xtendbeans.XtendBeanGenerator().getExpression(actual);
    if (expectedAsText.equals(actualAsText)) {
        throw new org.junit.ComparisonFailure("Expected and actual beans do not match", expectedAsText, actualAsText);
    }
}