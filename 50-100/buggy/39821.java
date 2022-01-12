protected final void associate(org.mousepilots.es.core.command.Command command) throws java.lang.IllegalStateException {
    if (commands.contains(command)) {
        throw new java.lang.IllegalStateException(((command + " is allready associated to ") + (this)));
    }
    if ((commands.size()) > (commandInsertionIndex)) {
        commands.subList(commandInsertionIndex, commands.size()).clear();
    }
    commands.add(command);
    (commandInsertionIndex)++;
}