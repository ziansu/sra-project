@java.lang.Override
public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String commandLabel, java.lang.String[] args) {
    java.lang.String commandName = cmd.getName().toLowerCase();
    if (!(commandName.equalsIgnoreCase("bank")))
        return true;
    
    if ((args.length) == 0)
        return false;
    
    return commandUtil.handleCommand(sender, cmd, commandLabel, args, be.charybde.bank.BCC.commandDispatcher);
}