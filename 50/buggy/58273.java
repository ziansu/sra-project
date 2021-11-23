private java.lang.String getInputWithoutCommand(java.lang.String input, java.lang.String command) {
    java.lang.String temp = input.substring(command.length()).trim();
    return temp;
}