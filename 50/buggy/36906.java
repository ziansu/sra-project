@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void postProcess(org.bukkit.event.player.PlayerInteractEvent event) {
    event.getPlayer().sendMessage("Interact event fired! MONITOR priority");
    if ((lastSignState) != null) {
        lastSignState.update();
        this.lastSignState = null;
    }
}