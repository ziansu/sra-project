@org.testng.annotations.Test(dataProvider = "testStringToArrayExceptionDataProvider")
public void testStringToArrayException(java.lang.String aLabel, java.lang.String aTestString, java.lang.String aPrefix, java.lang.String aSuffix, java.lang.String aSeparator, java.lang.String anEscapeChars, char anEscapeSymbol, java.lang.Class<? extends java.lang.Exception> anExpectedExceptionClass) {
    java.lang.System.out.println((("stringToArray (" + aLabel) + ")"));
    try {
        com.madphysicist.tools.util.TextUtilities.stringToArray(aTestString, aPrefix, aSuffix, aSeparator, anEscapeChars, anEscapeSymbol);
        org.testng.Assert.fail();
    } catch (java.lang.Exception exception) {
        org.testng.Assert.assertEquals(exception.getClass(), anExpectedExceptionClass);
    }
}