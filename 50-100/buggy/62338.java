@org.bukkit.event.EventHandler
public void WolfBreed(org.bukkit.event.entity.CreatureSpawnEvent event) {
    if (((event.getEntityType()) == (org.bukkit.entity.EntityType.WOLF)) && ((event.getSpawnReason()) == (org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason.BREEDING))) {
        org.bukkit.entity.Wolf wolf = ((org.bukkit.entity.Wolf) (event.getEntity()));
        java.lang.String name = wolf.getOwner().getName();
        org.bukkit.Bukkit.broadcastMessage("YO");
        if (claimedColors.containsKey(name))
            wolf.setCollarColor(claimedColors.get(name));
        
    }
}