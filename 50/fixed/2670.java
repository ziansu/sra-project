@org.junit.Test
public void testGetVariableValue() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = "set env:TERM;";
    final java.lang.String EXPECTED_PATTERN = "env:TERM";
    testScriptFile(SCRIPT_TEXT, getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()), EXPECTED_PATTERN, true);
}