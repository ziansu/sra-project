@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void postProcess(org.bukkit.event.player.PlayerInteractEvent event) {
    if ((lastSignState) != null) {
        lastSignState.update();
        this.lastSignState = null;
    }
}