@org.junit.Test
public void testBeelineHiveConfVariable() throws java.lang.Throwable {
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--hiveconf");
    argList.add("test.hive.table.name=dummy");
    final java.lang.String SCRIPT_TEXT = "create table ${hiveconf:test.hive.table.name} (d int);\nshow tables;\n" + " drop table ${hiveconf:test.hive.table.name};\n";
    final java.lang.String EXPECTED_PATTERN = "dummy";
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}