@net.canarymod.commandsys.TabComplete(commands = { "spawn" })
public java.util.List<java.lang.String> matchWorldNamePlayerName(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchToKnownWorld(args) : (args.length) == 2 ? net.canarymod.commandsys.TabCompleteHelper.matchToOnlinePlayer(args) : null;
}