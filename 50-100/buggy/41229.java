public void executeShell(java.lang.String shell, java.lang.String workDirectory) {
    com.intellij.execution.configurations.GeneralCommandLine commandLine = com.github.beansoftapp.reatnative.idea.utils.RNPathUtil.createFullPathCommandLine(shell);
    commandLine.setWorkDirectory(workDirectory);
    myGeneralCommandLine = commandLine;
    try {
        processCommandline(commandLine);
    } catch (com.intellij.execution.ExecutionException e) {
        com.github.beansoftapp.reatnative.idea.utils.NotificationUtils.showNotification(("Unable to run the commandline:" + (e.getMessage())), NotificationType.WARNING);
    }
}