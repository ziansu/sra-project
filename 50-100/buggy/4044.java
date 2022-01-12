@java.lang.Override
public java.lang.String read(java.lang.String arg, org.bukkit.command.CommandSender sender) throws com.massivecraft.massivecore.MassiveException {
    if (arg.isEmpty())
        throw new com.massivecraft.massivecore.MassiveException().addMsg("<b>You must at the very least supply a base command.");
    
    java.util.List<java.lang.String> args = com.massivecraft.massivecore.cmd.arg.ARStringCommand.argAsArgs(arg);
    java.lang.String alias = args.get(0);
    org.bukkit.command.Command command = com.massivecraft.massivecore.cmd.arg.ARStringCommand.getCommand(alias);
    if (command != null)
        return arg;
    
    if (alias.startsWith("/"))
        return arg.substring(1);
    
    return arg;
}