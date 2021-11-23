public void executeRedo() throws java.io.IOException, java.lang.Exception {
    if (!(lastStates.isEmpty())) {
        lastStates.push(LemonBuddy.FileStorage.readStringAsString(LemonBuddy.CommandExecutor.path));
        LemonBuddy.FileStorage.clear();
        LemonBuddy.FileStorage.writeStringAsString(undoneStates.pop());
    }else {
        java.lang.System.out.println("Already at current");
    }
}