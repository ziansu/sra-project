@org.bukkit.event.EventHandler
public void onClick(org.bukkit.event.inventory.InventoryClickEvent event) {
    if (((event.getCurrentItem()) != null) || ((event.getCurrentItem().getType()) == (org.bukkit.Material.AIR))) {
        if (event.getInventory().getName().equalsIgnoreCase(inv.getName())) {
            if (events.containsKey(event.getCurrentItem()))
                events.get(event.getCurrentItem()).clickEvent(event);
            
        }
    }
}