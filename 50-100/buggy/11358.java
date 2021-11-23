@org.junit.Test
public void testTSVOutput() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = getFormatTestQuery();
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=tsv");
    final java.lang.String EXPECTED_PATTERN = "\'1\'\t\'NULL\'\t\'defg\'\t\'ab\"c\'\t\'1.0\'";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}