@org.junit.Test
public void testConnectionUrlWithSemiColon() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getJdbcURL("default", "sess_var_list?var1=value1"));
    final java.lang.String SCRIPT_TEXT = "set var1";
    final java.lang.String EXPECTED_PATTERN = "var1=value1";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}