public void onInventoryCraft(org.getspout.spoutapi.event.inventory.InventoryCraftEvent event) {
    if (event.getPlayer().hasPermission("research.override"))
        return ;
    
    if ((TechManager.players.get(event.getPlayer()).cantCraft.contains(event.getResult().getTypeId())) && (event.getPlayer().hasPermission("research")))
        event.setCancelled(true);
    
}