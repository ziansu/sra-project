@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST)
public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent event) {
    setPlayer_join(true);
    org.bukkit.entity.Player player = event.getPlayer();
    if ((plugin.getWorldsHolder().getWorldData(player.getWorld().getName()).getUser(player.getName())) != null) {
        setPlayer_join(false);
        updatePermissions(event.getPlayer());
    }
    setPlayer_join(false);
}