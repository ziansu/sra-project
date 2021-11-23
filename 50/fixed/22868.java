@net.md_5.bungee.event.EventHandler(priority = net.md_5.bungee.event.EventPriority.HIGHEST)
public void playerDisconnectEvent(net.md_5.bungee.api.event.PlayerDisconnectEvent event) {
    handlePlayerQueueLeaving(event.getPlayer());
}