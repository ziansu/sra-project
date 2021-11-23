@org.junit.Test
public void testOneCommandInMultiLines() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = "drop table if exists multiCmdTbl;create table \nmultiCmdTbl " + "(key int);show tables; --one command in multiple lines";
    final java.lang.String EXPECTED_PATTERN = " multicmdtbl ";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
    final java.lang.String SCRIPT_TEXT_DROP = "drop table\nmultiCmdTbl;show tables;";
    testScriptFile(SCRIPT_TEXT_DROP, argList, EXPECTED_PATTERN, false);
}