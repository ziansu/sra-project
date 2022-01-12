@org.junit.Test
public void testEscapeSemiColonInQueries() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = "drop table if exists multiCmdTbl;create table multiCmdTbl " + ("(key int, value string) ROW FORMAT DELIMITED FIELDS TERMINATED BY \'\\;\' LINES " + " TERMINATED BY \'\\n\';show tables; --one command in multiple lines");
    final java.lang.String EXPECTED_PATTERN = " multicmdtbl ";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
    final java.lang.String SCRIPT_TEXT_DROP = "drop table\nmultiCmdTbl;show tables;";
    testScriptFile(SCRIPT_TEXT_DROP, EXPECTED_PATTERN, false, argList);
}