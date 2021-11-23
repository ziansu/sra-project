@org.bukkit.event.EventHandler
public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent event) {
    if (((event.getPlayer().getUniqueId()) == (player.getUniqueId())) && ((event.getView()) == (gui))) {
        destroy();
    }
}