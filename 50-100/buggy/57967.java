public com.gmail.einsyui.argumentreader.CommandWithLateArgs getCommandWithLateArgs(java.lang.String command) {
    if ((command.replace(" ", "")) == "")
        getCommandWithArgs("help", "");
    
    int i = command.indexOf(' ');
    if (i == (-1))
        return getCommandWithLateArgs(command, "");
    else
        return getCommandWithLateArgs(command.substring(0, i), command.substring((i + 1)));
    
}