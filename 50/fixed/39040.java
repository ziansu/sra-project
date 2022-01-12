public boolean handleCommand(java.lang.String commandName, java.util.List<java.lang.String> args) {
    final codeu.chat.client.commandline.Panel.Command command = commands.get(commandName);
    if (command != null) {
        command.invoke(args);
    }
    return command != null;
}