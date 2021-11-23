@net.canarymod.commandsys.TabComplete(commands = { "playermod permission remove" })
public java.util.List<java.lang.String> playermodPermissionRemove(net.canarymod.chat.MessageReceiver caller, java.lang.String[] parameters) {
    return (parameters.length) == 1 ? matchToKnownPlayer(parameters) : (parameters.length) == 2 ? matchToPlayerPermission(net.canarymod.Canary.getServer().matchKnownPlayer(parameters[1]), parameters) : null;
}