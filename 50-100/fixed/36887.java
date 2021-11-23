@org.junit.Test
public void testSelectQueryWithNonEscapedSemiColon() throws java.lang.Throwable {
    java.lang.String SCRIPT_TEXT = ("select \';\', \"\';\'\", \'\";\"\', \'\\\';\', \';\\\'\', \'\\\";\', \';\\\"\' from " + (org.apache.hive.beeline.TestBeeLineWithArgs.tableName)) + ";";
    final java.lang.String EXPECTED_PATTERN = ";\t\';\'\t\";\"\t\';\t;\'\t\";\t;\"";
    java.util.List<java.lang.String> argList = getBaseArgs(org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL());
    argList.add("--outputformat=tsv2");
    testScriptFile(SCRIPT_TEXT, argList, EXPECTED_PATTERN, true);
}