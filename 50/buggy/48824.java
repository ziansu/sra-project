@java.lang.Override
protected O[] executeAsync() throws java.io.IOException {
    return this.callEndpointArrayBlocking(commandName, input).execute();
}