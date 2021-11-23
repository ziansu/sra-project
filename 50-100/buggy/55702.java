public void receiveCommand(java.lang.String receivedCommand) {
    java.lang.String[] commandParameters = receivedCommand.split(" ");
    java.lang.String command = commandParameters[0];
    if (possibleCommands.containsKey(command)) {
        com.ciastek.shell.Command currentCommand = possibleCommands.get(command);
        currentCommand.setCommandParameters(commandParameters);
        currentCommand.executeCommand(shellParameters);
    }else
        if (command.equals("exit")) {
            running = false;
        }else {
            java.lang.System.out.println((receivedCommand + ": unknown command"));
        }
    
}