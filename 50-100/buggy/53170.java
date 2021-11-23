@org.junit.Test
public void testEmbeddedBeelineOutputs() throws java.lang.Throwable {
    java.lang.String embeddedJdbcURL = (org.apache.hive.jdbc.Utils.URL_PREFIX) + "/Default";
    java.util.List<java.lang.String> argList = getBaseArgs(embeddedJdbcURL);
    final java.lang.String SCRIPT_TEXT = "set hive.lock.manager=org.apache.hadoop.hive.ql.lockmgr.EmbeddedLockManager;\n" + ((("set hive.compute.query.using.stats=false;\n" + "create table if not exists embeddedBeelineOutputs(d int);\n") + "set a=1;\nselect count(*) from embeddedBeelineOutputs;\n") + "drop table embeddedBeelineOutputs;\n");
    final java.lang.String EXPECTED_PATTERN = "Stage-1 map =";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList, org.apache.hive.beeline.TestBeeLineWithArgs.OutStream.ERR);
}