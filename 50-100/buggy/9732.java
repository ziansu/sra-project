public boolean fireProjectile(final java.lang.Class<? extends MarsRoverKata.Projectile> type) {
    MarsRoverKata.Projectile projectileToFire = com.google.common.collect.Iterables.get(com.google.common.collect.Collections2.filter(projectiles, new com.google.common.base.Predicate<MarsRoverKata.Projectile>() {
        @java.lang.Override
        public boolean apply(MarsRoverKata.Projectile input) {
            return input.getClass().isAssignableFrom(type);
        }
    }), 1, null);
    if (projectileToFire == null) {
        return false;
    }
    projectileToFire.launch(getFacing(), getLocation());
    projectiles.remove(projectileToFire);
    return true;
}