@org.junit.Test
public void testShowDbInPrompt() throws java.lang.Throwable {
    final java.lang.String EXPECTED_PATTERN = " \\(default\\)>";
    java.util.List<java.lang.String> argList = new java.util.ArrayList<java.lang.String>();
    argList.add("--showDbInPrompt");
    argList.add("-u");
    argList.add(((org.apache.hive.beeline.TestBeeLineWithArgs.miniHS2.getBaseJdbcURL()) + ";user=hivetest;password=hive"));
    java.lang.String SCRIPT_TEXT = "select current_user();";
    testScriptFile(SCRIPT_TEXT, EXPECTED_PATTERN, true, argList);
}