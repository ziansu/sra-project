public float distanceTo(tank_revolution.model.Tank tank, tank_revolution.model.ShootablePackage.Shootable projectile) {
    float deltaX = (getTankX(tank)) - (getProjectileX(projectile));
    float deltaY = (getTankY(tank)) - (getProjectileY(projectile));
    return ((float) (java.lang.Math.sqrt(((deltaX * deltaX) + (deltaY * deltaY)))));
}