@org.junit.Test
public void testQueryProgressParallel() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = (("set hive.support.concurrency = false;\n" + ("set hive.exec.parallel = true;\n" + "select count(*) from ")) + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + ";\n";
    final java.lang.String EXPECTED_PATTERN = "Number of reducers determined to be.";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()), org.apache.hive.beeline.TestBeeLineWithArgs.OutStream.ERR);
}