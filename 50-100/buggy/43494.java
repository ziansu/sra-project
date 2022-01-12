public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command command, java.lang.String commandLabel, java.lang.String[] args) {
    if (commandLabel.equalsIgnoreCase("togglehoe")) {
        enabled = !(enabled);
        sender.sendMessage((("Hoes are now " + (enabled)) + "!"));
        plugin.getLogger().info(("Hoes have been " + (enabled)));
        return true;
    }
    return false;
}