@java.lang.Override
public java.lang.String executeTask() throws java.lang.Exception {
    com.iwave.ext.linux.command.powerpath.PowermtCheckRegistrationCommand command = new com.iwave.ext.linux.command.powerpath.PowermtCheckRegistrationCommand();
    try {
        executeCommand(command, com.emc.sa.service.linux.tasks.SHORT_TIMEOUT);
        return null;
    } catch (com.iwave.ext.linux.command.powerpath.PowerPathException e) {
        return e.getMessage();
    }
}