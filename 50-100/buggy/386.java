@java.lang.Override
public boolean onCommand(org.bukkit.command.CommandSender sender, org.bukkit.command.Command cmd, java.lang.String label, java.lang.String[] args) {
    if (sender instanceof org.bukkit.command.ConsoleCommandSender)
        plugin.getLogger().info("Command has to be excecuted by player");
    
    org.bukkit.entity.Player p = ((org.bukkit.entity.Player) (sender));
    if (label.equalsIgnoreCase("money"))
        p.sendMessage(((((com.essentials.mcoldlife.main.Reference.CHAT_PREFIX) + "�aDu hast �6") + (com.mcoldlife.rpg.Money.getMoney(p))) + " Gold."));
    
    return false;
}