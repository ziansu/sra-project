@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL)
public void inventoryClick(final org.bukkit.event.inventory.InventoryClickEvent event) {
    if ((event.getView()) instanceof org.caliog.Villagers.Utils.QuestInventory) {
        boolean cancel = ((org.caliog.Villagers.Utils.QuestInventory) (event.getView())).inventoryClick(event);
        if (cancel)
            event.setCancelled(cancel);
        
    }
}