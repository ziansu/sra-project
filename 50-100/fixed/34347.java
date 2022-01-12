public double calculateDamageByEntity(double baseDamage, org.bukkit.entity.Entity source, org.bukkit.entity.Entity target, org.bukkit.event.entity.EntityDamageEvent.DamageCause cause) {
    if (((containsSource(source.getType())) && (containsTarget(target.getType()))) && (containsCause(cause)))
        return formula.calculateDamage(baseDamage, target);
    else
        return baseDamage;
    
}