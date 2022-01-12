@net.canarymod.commandsys.TabComplete(commands = { "playermod permission remove" })
public java.util.List<java.lang.String> playermodPermissionRemove(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchToKnownPlayer(parameters) : (parameters.length) == 2 ? net.canarymod.commandsys.TabCompleteHelper.matchToPlayerPermission(net.canarymod.Canary.getServer().matchKnownPlayer(parameters[1]), parameters) : null;
}