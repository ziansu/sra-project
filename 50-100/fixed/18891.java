@java.lang.Override
public void applyPowers(org.bukkit.entity.Entity entity) {
    com.magmaguy.elitemobs.MetadataHandler metadataHandler = new com.magmaguy.elitemobs.MetadataHandler(plugin);
    entity.setMetadata(metadataHandler.movementSpeedMD, new org.bukkit.metadata.FixedMetadataValue(plugin, true));
    ((org.bukkit.entity.LivingEntity) (entity)).addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, java.lang.Integer.MAX_VALUE, 2));
    com.magmaguy.elitemobs.powerstances.MinorPowerPowerStance minorPowerPowerStance = new com.magmaguy.elitemobs.powerstances.MinorPowerPowerStance(plugin);
    minorPowerPowerStance.itemEffect(entity);
}