public static com.stericson.RootShell.execution.Command runCommand(com.stericson.RootShell.execution.Command command) throws java.io.IOException, java.util.concurrent.TimeoutException {
    return com.stericson.RootShell.execution.Shell.startShell().add(command);
}