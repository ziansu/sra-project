@org.junit.Test
public void testWhitespaceBeforeCommentScriptFile() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = " \t \t-- comment has spaces and tabs before it\n \t \t# comment has spaces and tabs before it\n";
    final java.lang.String EXPECTED_PATTERN = "cannot recognize input near '<EOF>'";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, false);
}