@java.lang.Override
public void sendCommand(org.traccar.database.ActiveDevice activeDevice, org.traccar.model.Command command) {
    if (!(supportedCommands.contains(command.getType()))) {
        throw new java.lang.RuntimeException(((("Command " + (command.getType())) + " is not supported in protocol ") + (getName())));
    }
    activeDevice.write(command);
}