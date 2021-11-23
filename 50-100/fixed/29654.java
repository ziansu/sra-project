private java.lang.Process terminal_action(java.lang.String[] cl) throws java.io.IOException {
    CommandLine command = new CommandLine(cl);
    command.setWorkingDirectory(getPath());
    command.setInTerminal(true);
    java.lang.Process p = command.run();
    return p;
}