public java.util.Queue<java.lang.String> getBackedupCommands() {
    java.util.Queue<java.lang.String> reloadedCommands = dataLoader.getCommandsUponInit();
    dataLoader.clearCommandFile();
    return new java.util.LinkedList(reloadedCommands);
}