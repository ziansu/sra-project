@java.lang.Override
public boolean runCommand(org.bukkit.command.CommandSender sender, java.lang.String[] args, me.Fupery.HeadShop.Command.ReturnMessage msg) {
    if (!(plugin.removeHead(args[1]))) {
        msg.message = me.Fupery.HeadShop.Command.ReturnMessage.errorMessage("Player head '%s' could not be found!");
        return false;
    }
    sender.sendMessage((((me.Fupery.HeadShop.HeadShop.prefix) + (org.bukkit.ChatColor.DARK_GREEN)) + (java.lang.String.format("Successfully removed %s.", args[1]))));
    return true;
}