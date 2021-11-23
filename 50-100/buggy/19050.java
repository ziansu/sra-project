public void applyHpBonus(org.bukkit.entity.LivingEntity entity) {
    if (!(entity.isValid())) {
        return ;
    }
    java.lang.Integer hpToAdd = getHpBonus(entity);
    if (entity instanceof org.bukkit.entity.Player) {
        entity.setMaxHealth(((entity.getMaxHealth()) + hpToAdd));
        entity.setHealth(((entity.getMaxHealth()) + hpToAdd));
    }
}