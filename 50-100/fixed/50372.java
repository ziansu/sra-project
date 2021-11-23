@org.junit.Test
public void testDSVOutputWithDoubleQuotes() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = getFormatTestQueryForEableQuotes();
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=dsv");
    argList.add("--delimiterForDSV=;");
    java.lang.System.setProperty(SeparatedValuesOutputFormat.DISABLE_QUOTING_FOR_SV, "false");
    final java.lang.String EXPECTED_PATTERN = "1;NULL;defg;\"ab\"\"c\";\"\"\"aa\"\"\";1.0";
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
    java.lang.System.setProperty(SeparatedValuesOutputFormat.DISABLE_QUOTING_FOR_SV, "true");
}