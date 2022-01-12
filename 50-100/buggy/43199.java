public void testEnvValueSelectorForValue() {
    java.lang.String env = "DEV";
    java.lang.String value = "echo Howzit";
    int lineNumber = 0;
    java.lang.String line = java.lang.String.format("%s%s%s%s%s", ShellScriptListProcessor.COMMENT_LEADER, ShellScriptListProcessor.VALUE_SENTINAL, env, ShellScriptListProcessor.VALUE_SENTINAL, value);
    assertEquals(value, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, env));
    assertEquals(value, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, env.toLowerCase()));
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(lineNumber, line, "SIT"));
}