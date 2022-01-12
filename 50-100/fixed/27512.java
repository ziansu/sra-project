protected void performGetAction(final java.lang.String key, final java.lang.String defaultValue, final java.io.Writer output) throws java.io.IOException {
    java.lang.System.out.println("INFO: Get action is performing.");
    java.lang.String answer = substitutor.get(key);
    if ((answer.isEmpty()) && (defaultValue != null)) {
        answer = defaultValue;
    }
    output.write("VALUE\n");
    output.write(answer);
    output.write("\n");
}