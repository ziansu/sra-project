@java.lang.Override
public void handleProjectileArrive(gamemodel.Direction dir, gamemodel.Projectile projectile) {
    debug.SkeletonLogger.functionCalled(this, "handleProjectileArrive", new java.lang.Object[]{ dir , projectile });
    projectile.setPosition(this);
    gamemodel.Direction oppositeDirection = gamemodel.Direction.getOppositeDirection(dir);
    gamemodel.Stargate stargate = stargates.get(oppositeDirection);
    if (stargate == null) {
        stargate = projectile.openStargate();
        stargates.put(oppositeDirection, stargate);
    }
    projectile.destroy();
    debug.SkeletonLogger.returnFromFunction(null);
}