@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void checkWeaponRestriction(org.bukkit.event.entity.EntityDamageByEntityEvent event) {
    if (!((event.getDamager()) instanceof org.bukkit.entity.Player))
        return ;
    
    if (!(LoreAttributes.loreManager.canUse(((org.bukkit.entity.Player) (event.getDamager())), ((org.bukkit.entity.Player) (event.getDamager())).getItemInHand()))) {
        event.setCancelled(true);
    }
}