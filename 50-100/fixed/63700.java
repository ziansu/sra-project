@org.junit.Test
public void testHiveVarSubstitution() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(((org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()) + "#D_TBL=dummy_t"));
    final java.lang.String SCRIPT_TEXT = "create table ${D_TBL} (d int);\nshow tables;\ndrop  table ${D_TBL};\n";
    final java.lang.String EXPECTED_PATTERN = "dummy_t";
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}