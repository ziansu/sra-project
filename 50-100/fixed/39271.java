@org.junit.Test
public void testQueryProgressHidden() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = (("set hive.support.concurrency = false;\n" + ("!set silent true\n" + "select count(*) from ")) + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + ";\n";
    final java.lang.String EXPECTED_PATTERN = "Executing command";
    testScriptFile(SCRIPT_TEXT, getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()), org.apache.hive.beeline.TestBeeLineWithArgs.OutStream.ERR, EXPECTED_PATTERN, false);
}