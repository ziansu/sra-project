private void CommandAction(org.bukkit.entity.Player player, java.lang.String[] args) {
    if (player.hasPermission("hq.action")) {
        if (!(plugin.getSenderManager().isDoingQuest(player.getName()))) {
            player.sendMessage(((org.bukkit.ChatColor.RED) + "You are not on any quest!"));
            return ;
        }
        plugin.getQuestManager().handleAction(player, args[0]);
    }else {
        player.sendMessage(((org.bukkit.ChatColor.RED) + "You do not have permission for this command!"));
    }
}