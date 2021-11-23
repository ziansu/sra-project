@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onCreatureSpawn(org.bukkit.event.entity.CreatureSpawnEvent event) {
    if (!(event.getEntity().getType().toString().equals("ENDER_DRAGON")))
        return ;
    
    if (!(event.isCancelled()))
        return ;
    
    if (eu.phiwa.dragontravel.core.DragonTravel.getInstance().getConfigHandler().isIgnoreAntiMobspawnAreas())
        event.setCancelled(false);
    
}