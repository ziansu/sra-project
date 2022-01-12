@org.junit.Test
public void testNullEmpty() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = (("set hive.support.concurrency = false;\n" + "!set nullemptystring true\n select \'abc\',null,\'def\' from ") + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + " limit 1 ;\n";
    final java.lang.String EXPECTED_PATTERN = "abc,,def";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=csv2");
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}