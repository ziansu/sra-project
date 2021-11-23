@net.canarymod.commandsys.TabComplete(commands = { "playermod permission remove" })
public java.util.List<java.lang.String> playerGroupTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchTo(parameters, new java.lang.String[]{ "list" , "check" , "set" , "add" }) : null;
}