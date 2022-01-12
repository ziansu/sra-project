@org.junit.Test
public void testTSVOutputDeprecation() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = getFormatTestQuery();
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=tsv");
    final java.lang.String EXPECTED_PATTERN = "Format tsv is deprecated, please use tsv2";
    testScriptFile(SCRIPT_TEXT, argList, org.apache.hive.beeline.TestBeeLineWithArgs.OutStream.ERR, EXPECTED_PATTERN, true);
}