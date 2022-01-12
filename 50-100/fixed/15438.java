@org.junit.Test
public void testBeelineWithForce() throws java.lang.Throwable {
    final java.lang.String SCRIPT_TEXT = "drop table does_not_exist;\ncreate table incomplete_syntax(a, string, );\n " + ("drop table if exists new_table;\n create table new_table(foo int, bar string);\n " + "desc new_table;\n");
    final java.lang.String EXPECTED_PATTERN = "2 rows selected";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--force");
    testScriptFile(SCRIPT_TEXT, argList, org.apache.hive.beeline.TestBeeLineWithArgs.OutStream.ERR, EXPECTED_PATTERN, true);
}