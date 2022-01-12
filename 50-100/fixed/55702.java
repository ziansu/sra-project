public void receiveCommand(java.lang.String receivedCommand) {
    java.lang.String[] commandParameters = receivedCommand.split(" ");
    if ((commandParameters.length) < 1)
        java.lang.System.out.println((receivedCommand + ": unknown command"));
    else {
        executeCommand(receivedCommand, commandParameters);
    }
}