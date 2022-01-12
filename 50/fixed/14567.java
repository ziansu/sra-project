@org.bukkit.event.EventHandler(ignoreCancelled = true, priority = org.bukkit.event.EventPriority.LOWEST)
public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent e) {
    if (e.getPlayer().getWorld().equals(plugin.getCfg().getLobbyWorld())) {
        pm.returnPlayerStuff(e.getPlayer());
    }
}