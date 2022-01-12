@org.junit.Test
public void testDSVOutput() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = getFormatTestQuery();
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=dsv");
    argList.add("--delimiterForDSV=;");
    final java.lang.String EXPECTED_PATTERN = "1;NULL;defg;ab\"c;1.0";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}