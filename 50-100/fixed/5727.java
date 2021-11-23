public float distanceTo(tank_revolution.model.Tank tank, tank_revolution.model.ShootablePackage.Shootable projectile) {
    float deltaX = java.lang.Math.abs(((getTankX(tank)) - (getProjectileX(projectile))));
    float deltaY = java.lang.Math.abs(((getTankY(tank)) - (getProjectileY(projectile))));
    return ((float) (java.lang.Math.sqrt(((deltaX * deltaX) + (deltaY * deltaY)))));
}