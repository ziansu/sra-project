@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onPlayerInteractEntity(final org.bukkit.event.player.PlayerInteractEntityEvent ev) {
    if (((p.getPlayerData(ev.getPlayer()).isSpectating()) && ((ev.getRightClicked()) instanceof org.bukkit.entity.Player)) && (!(ev.getRightClicked().hasMetadata("NPC")))) {
        ev.setCancelled(true);
    }
}