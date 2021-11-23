@net.canarymod.commandsys.TabComplete(commands = { "playermod group add" , "playermod group remove" , "playermod group set" })
public java.util.List<java.lang.String> playermodGroupAddRemoveSet(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchToKnownPlayer(parameters) : (parameters.length) == 2 ? matchToGroup(parameters) : null;
}