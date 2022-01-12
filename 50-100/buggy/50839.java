public void testEnvValueSelectorForNull() {
    java.lang.String line = null;
    int lineNumber = 0;
    java.lang.String env = "DEV";
    java.lang.String cmd = "echo Howzit";
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, null));
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, env));
    line = "#:DEV: " + cmd;
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, env));
}