@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void playerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    if (afkBooter.getMovementTrackerFlag()) {
        afkBooter.stopTrackingPlayer(event.getPlayer().getName());
    }
    movementTracker.removePlayer(event.getPlayer().getName());
}