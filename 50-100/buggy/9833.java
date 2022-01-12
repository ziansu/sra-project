@net.canarymod.commandsys.TabComplete(commands = { "disableplugin" , "reloadplugin" })
public java.util.List<java.lang.String> matchPluginName(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchTo(args, net.canarymod.Canary.pluginManager().getPluginNames().toArray(new java.lang.String[0])) : null;
}