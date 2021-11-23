@net.canarymod.commandsys.TabComplete(commands = { "warp" , "delwarp" })
public java.util.List<java.lang.String> matchWarpNames(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchToWarpNames(args, caller) : null;
}