@net.canarymod.commandsys.TabComplete(commands = { "mobspawner" })
public java.util.List<java.lang.String> mobspawnerTabComplete(net.canarymod.chat.MessageReceiver caller, java.lang.String[] args) {
    return (args.length) == 1 ? net.canarymod.commandsys.TabCompleteHelper.matchTo(args, new java.lang.String[]{ "set" , "check" }) : ((args.length) > 2) && (args[1].equals("set")) ? net.canarymod.commandsys.TabCompleteHelper.matchTo(args, new java.lang.String[]{ "id:" , "delay:" , "minDelay:" , "maxDelay:" , "count:" , "maxNearby:" , "playerRange:" , "spawnRange:" }) : null;
}