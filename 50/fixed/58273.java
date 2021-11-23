private java.lang.String getInputWithoutCommand(java.lang.String input, java.lang.String command) {
    return input.substring(command.length()).trim();
}