public entity.projectile.Projectile getProjectile(level.maps.Level level) {
    if (level == null)
        return null;
    
    return level.entityManager.getProjectile(getUniqueID());
}