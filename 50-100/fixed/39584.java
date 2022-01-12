@org.junit.Test
public void testNullEmptyCmdArg() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = (("set hive.support.concurrency = false;\n" + "select 'abc',null,'def' from ") + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + " limit 1 ;\n";
    final java.lang.String EXPECTED_PATTERN = "'abc','','def'";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--nullemptystring=true");
    argList.add("--outputformat=csv");
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}