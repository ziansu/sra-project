@org.bukkit.event.EventHandler
public void onInventoryItemMove(org.bukkit.event.inventory.InventoryMoveItemEvent event) {
    org.bukkit.inventory.Inventory src = event.getSource();
    org.bukkit.inventory.Inventory dest = event.getDestination();
    org.bukkit.inventory.Inventory me = event.getInitiator();
    if (passThrough(src, dest, me)) {
        return ;
    }
    if ((isProtected(event.getSource(), false)) || (isProtected(event.getDestination(), true))) {
        event.setCancelled(true);
    }
}