@net.canarymod.commandsys.TabComplete(commands = { "playerinfo" , "home" , "op" , "playermod permission add" , "playermod permission check" , "playermod prefix" , "playermod remove" , "playermod group list" })
public java.util.List<java.lang.String> matchKnownPlayer(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchToKnownPlayer(args) : null;
}