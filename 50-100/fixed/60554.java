public com.gmail.einsyui.argumentreader.CommandWithLateArgs getCommandWithLateArgs(java.lang.String name, java.lang.String arguments) {
    if (name == "")
        name = "help";
    
    if (!(commandTable.containsKey(name.toLowerCase()))) {
        unknownCommand(name);
        return null;
    }
    com.gmail.einsyui.argumentreader.Command cmd = commandTable.get(name);
    return new com.gmail.einsyui.argumentreader.CommandWithLateArgs(cmd, arguments, context, this);
}