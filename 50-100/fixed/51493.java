@org.bukkit.event.EventHandler
public void onPlayerChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    if (config.isMuted(player)) {
        event.getPlayer().sendMessage(((org.bukkit.ChatColor.DARK_RED) + "You are currently muted!"));
        event.setCancelled(true);
    }
}