@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST, ignoreCancelled = true)
public void onEntityDamageByBlock(org.bukkit.event.entity.EntityDamageByBlockEvent event) {
    org.bukkit.block.Block block = event.getDamager();
    if (com.projectkorra.projectkorra.util.TempBlock.isTempBlock(block)) {
        if ((com.projectkorra.projectkorra.ability.EarthAbility.isEarthbendable(block.getType())) && (com.projectkorra.projectkorra.GeneralMethods.isSolid(block))) {
            event.setCancelled(true);
            return ;
        }
    }
}