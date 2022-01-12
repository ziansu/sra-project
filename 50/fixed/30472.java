public static tranquvis.simplesmsremote.ControlCommand getFromCommand(java.lang.String command) {
    command = command.trim().toLowerCase();
    for (tranquvis.simplesmsremote.ControlCommand com : tranquvis.simplesmsremote.ControlCommand.ALL) {
        if (com.command.equals(command))
            return com;
        
    }
    return null;
}