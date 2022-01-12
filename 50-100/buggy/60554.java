public com.gmail.einsyui.argumentreader.CommandWithLateArgs getCommandWithLateArgs(java.lang.String name, java.lang.String arguments) {
    if (name == "")
        name = "help";
    
    if (!(commandTable.containsKey(name.toLowerCase()))) {
        unknownCommand(name);
        return null;
    }
    com.gmail.einsyui.argumentreader.Command cmd = commandTable.get(name);
    com.gmail.einsyui.argumentreader.ArgumentReader ar = new com.gmail.einsyui.argumentreader.ArgumentReader(arguments, this);
    return new com.gmail.einsyui.argumentreader.CommandWithLateArgs(cmd, ar, context);
}