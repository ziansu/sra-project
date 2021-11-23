@org.junit.Test
public void testBeelineHiveVariable() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--hivevar");
    argList.add("DUMMY_TBL=dummy");
    final java.lang.String SCRIPT_TEXT = "create table ${DUMMY_TBL} (d int);\nshow tables;\n drop table  ${DUMMY_TBL};";
    final java.lang.String EXPECTED_PATTERN = "dummy";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}