@org.bukkit.event.EventHandler
public void handle(org.bukkit.event.player.PlayerQuitEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    java.util.UUID uuid = player.getUniqueId();
    if ((compond.state(uuid)) == null) {
        manager.save(player, true);
    }
}