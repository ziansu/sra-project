@org.junit.Test
public void testTabInScriptFile() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    final java.lang.String SCRIPT_TEXT = "CREATE\tTABLE IF NOT EXISTS testTabInScriptFile\n(id\tint);\nSHOW TABLES;" + "\ndrop table testTabInScriptFile";
    final java.lang.String EXPECTED_PATTERN = "testTabInScriptFile";
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}