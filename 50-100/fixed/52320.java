@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL, ignoreCancelled = true)
public void onCreatureSpawn(org.bukkit.event.entity.CreatureSpawnEvent event) {
    com.Ben12345rocks.AdvancedMobControl.Object.EntityHandler entityHandle = new com.Ben12345rocks.AdvancedMobControl.Object.EntityHandler(event.getEntityType());
    double health = entityHandle.creatureSpawn(event.getEntity().getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue(), event.getSpawnReason());
    event.getEntity().getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(health);
    event.getEntity().setHealth(health);
}