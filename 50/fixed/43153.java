@org.junit.Test
public void testQueryNonEscapedSemiColon() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = "drop table if exists nonEscapedSemiColon;create table nonEscapedSemiColon " + "(key int) ROW FORMAT DELIMITED FIELDS TERMINATED BY ';';show tables;";
    final java.lang.String EXPECTED_PATTERN = " nonEscapedSemiColon ";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}