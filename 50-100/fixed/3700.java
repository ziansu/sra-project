@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onPrisonPearlEvent(com.untamedears.PrisonPearl.events.PrisonPearlEvent event) {
    if ((event.getType()) == (PrisonPearlEvent.Type.NEW)) {
        java.util.UUID uuid = event.getPrisonPearl().getImprisonedId();
        portaled_players.remove(uuid);
        if ((mysqlStorage) != null)
            mysqlStorage.removePortaledPlayer(uuid);
        
        dirty = true;
    }
}