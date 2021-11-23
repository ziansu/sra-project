private java.lang.String performCommandN(int nextCommand) {
    if (!(activeState)) {
        return "";
    }
    performCommand(getCommand(latestCommand));
    latestCommand = nextCommand;
    return "";
}