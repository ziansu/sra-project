public void saveLastState() throws java.io.IOException, java.lang.Exception {
    java.lang.String currentState = LemonBuddy.FileStorage.readStringAsString(LemonBuddy.CommandExecutor.path);
    java.lang.System.out.println(currentState);
    lastStates.push(currentState);
    lastState = currentState;
    undoneStates = new java.util.Stack<java.lang.String>();
}