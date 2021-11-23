@java.lang.Override
public void addBlockedCommand(java.lang.String command) {
    if (rawTargetCommands.contains(command)) {
        return ;
    }
    getBlockedCommands().add(command);
    rawTargetCommands.add(command);
}