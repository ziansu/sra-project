public boolean attackEntity(org.bukkit.entity.LivingEntity target, org.bukkit.entity.Player attacker, double damage) {
    org.bukkit.event.entity.EntityDamageByEntityEvent damageEvent = new org.bukkit.event.entity.EntityDamageByEntityEvent(attacker, target, org.bukkit.event.entity.EntityDamageEvent.DamageCause.ENTITY_ATTACK, damage);
    org.bukkit.Bukkit.getPluginManager().callEvent(damageEvent);
    if (damage == 0) {
        return !(damageEvent.isCancelled());
    }
    if (!(damageEvent.isCancelled())) {
        target.damage(damage);
        return true;
    }
    return false;
}