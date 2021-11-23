@org.junit.Test
public void testNullNonEmpty() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = (("set hive.support.concurrency = false;\n" + "!set nullemptystring false\n select null from ") + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + " limit 1 ;\n";
    final java.lang.String EXPECTED_PATTERN = "NULL";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()));
}