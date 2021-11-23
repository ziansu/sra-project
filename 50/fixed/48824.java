@java.lang.Override
protected java.util.List<O> executeAsync() throws java.io.IOException {
    return java.util.Arrays.asList(this.callEndpointArrayBlocking(commandName, input).execute());
}