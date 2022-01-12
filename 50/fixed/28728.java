@org.bukkit.event.EventHandler
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    if (event.getEntity().getUniqueId().equals(player.getUniqueId())) {
        destroy();
    }
}