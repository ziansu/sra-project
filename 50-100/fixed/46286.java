@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onPlayerInteractEntity(final org.bukkit.event.player.PlayerInteractEntityEvent ev) {
    if ((!(ev.getPlayer().hasMetadata("NPC"))) && (p.getPlayerData(ev.getPlayer()).isSpectating())) {
        ev.setCancelled(true);
    }
}