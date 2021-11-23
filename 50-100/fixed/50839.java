public void testEnvValueSelectorForNull() {
    java.lang.String line = null;
    java.lang.String env = "DEV";
    java.lang.String cmd = "echo Howzit";
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, null));
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, env));
    line = "#:DEV: " + cmd;
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, env));
}