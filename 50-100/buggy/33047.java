public void moveProjectile(model.projectile.Projectile projectile, model.map.GridLocation destination) {
    if (isValidGridLocation(destination)) {
        removeProjectile(projectile);
        addProjectile(projectile, destination);
        if ((!(isPassable(projectile, destination))) || ((getEntity(destination)) != null)) {
            triggerProjectileEffect(projectile);
            removeProjectile(projectile);
        }
    }
}