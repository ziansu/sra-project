@java.lang.Override
public java.lang.String executeTask() throws java.lang.Exception {
    com.iwave.ext.linux.command.MultipathCommand command = new com.iwave.ext.linux.command.MultipathCommand();
    command.addArgument("-l");
    executeCommand(command, com.emc.sa.service.linux.tasks.SHORT_TIMEOUT);
    try {
        com.iwave.ext.command.CommandOutput output = command.getOutput();
        if ((output.getExitValue()) != 0) {
            return getMessage("CheckForMultipath.noMultipath");
        }
        return null;
    } catch (com.iwave.ext.linux.command.MultipathException e) {
        return e.getMessage();
    }
}