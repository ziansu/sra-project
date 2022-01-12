public static boolean getUsageOfCmd(org.bukkit.command.CommandSender sender, java.lang.String cmd) {
    try {
        java.lang.String usage = org.bukkit.Bukkit.getPluginCommand(cmd).getUsage();
        sender.sendMessage(usage);
    } catch (java.lang.Exception e) {
        sender.sendMessage("Can't show usage of command.(Command not found)");
        e.printStackTrace();
    }
    return true;
}