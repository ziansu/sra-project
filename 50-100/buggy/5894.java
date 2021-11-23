@org.junit.Test
public void testEmbeddedBeelineConnection() throws java.lang.Throwable {
    java.lang.String embeddedJdbcURL = (org.apache.hive.jdbc.Utils.URL_PREFIX) + "/Default";
    java.util.List<java.lang.String> argList = getBaseArgs(embeddedJdbcURL);
    argList.add("--hivevar");
    argList.add("DUMMY_TBL=embedded_table");
    final java.lang.String SCRIPT_TEXT = "set hive.lock.manager=org.apache.hadoop.hive.ql.lockmgr.EmbeddedLockManager;\n" + "create table ${DUMMY_TBL} (d int);\nshow tables;\n drop table ${DUMMY_TBL};\n";
    final java.lang.String EXPECTED_PATTERN = "embedded_table";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}