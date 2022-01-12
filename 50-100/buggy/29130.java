private void takeAShot() {
    Space space = ((Space) (getWorld()));
    Ship ship = space.getShip();
    (weaponDelay)++;
    if ((shootProgress) > 0) {
        if (((weaponDelay) % (cyclesBetweenShots)) == 0) {
            (shootProgress)--;
            shoot(playerX, playerY, currentWeapon);
        }
    }else {
        queueInUse(false);
    }
}