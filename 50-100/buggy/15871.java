public com.gmail.einsyui.argumentreader.CommandWithArgs getCommandWithArgs(java.lang.String command) {
    if ((command.replace(" ", "")) == "")
        getCommandWithArgs("help", "");
    
    int i = command.indexOf(' ');
    if (i == (-1))
        return getCommandWithArgs(command, "");
    else
        return getCommandWithArgs(command.substring(0, i), command.substring((i + 1)));
    
}