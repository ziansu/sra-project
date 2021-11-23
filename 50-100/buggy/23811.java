@org.bukkit.event.EventHandler
public void onInventoryClose(org.bukkit.event.inventory.InventoryCloseEvent event) {
    if ((!(event.getInventory().getName().equals(name))) && ((de.pesacraft.cannonfight.util.CannonFighter.get(((org.bukkit.OfflinePlayer) (event.getPlayer())))) == (viewer)))
        return ;
    
    unregister();
}