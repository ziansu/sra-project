@net.canarymod.commandsys.TabComplete(commands = { "whitelist" })
public java.util.List<java.lang.String> whitelistTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchTo(parameters, new java.lang.String[]{ "add" , "remove" , "show" , "list" , "enable" , "on" , "disable" , "off" , "reload" }) : null;
}