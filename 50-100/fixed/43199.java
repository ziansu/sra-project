public void testEnvValueSelectorForValue() {
    java.lang.String env = "DEV";
    java.lang.String value = "echo Howzit";
    java.lang.String line = java.lang.String.format("%s%s%s%s%s", ShellScriptListProcessor.COMMENT_LEADER, ShellScriptListProcessor.VALUE_SENTINAL, env, ShellScriptListProcessor.VALUE_SENTINAL, value);
    assertEquals(value, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, env));
    assertEquals(value, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, env.toLowerCase()));
    assertEquals(null, com.pearceful.util.ShellScriptListProcessor.valueToBeSelected(line, "SIT"));
}