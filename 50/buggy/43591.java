public static void runCommand(com.stericson.RootShell.execution.Command command) throws java.io.IOException, java.util.concurrent.TimeoutException {
    com.stericson.RootShell.execution.Shell.startShell().add(command);
}