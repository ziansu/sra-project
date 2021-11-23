@org.junit.Test
public void testBeelineShellCommand() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    final java.lang.String SCRIPT_TEXT = "!sh echo \"hello world.\" > hw.txt\n!sh cat hw.txt\n!rm hw.txt";
    final java.lang.String EXPECTED_PATTERN = "hello world";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}