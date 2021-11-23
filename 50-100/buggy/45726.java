public void handleCommand(java.lang.String input) {
    commandhandling.Command cmd = getCommand(input);
    if (cmd != null) {
        if ((input.indexOf(" ")) == (-1)) {
            cmd.execute("");
        }else {
            cmd.execute(input.substring(((input.indexOf(' ')) + 1)));
        }
    }
}