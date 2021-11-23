public static void registerCommand(me.wirlie.allbanks.command.Command command, java.lang.String label, java.lang.String... arguments) {
    java.util.List<java.lang.String> argumentsRepresentation = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String s : arguments) {
        argumentsRepresentation.add(s);
    }
    command.setArguments(arguments);
    me.wirlie.allbanks.command.CommandManagerAB.registeredCommands.add(command);
}