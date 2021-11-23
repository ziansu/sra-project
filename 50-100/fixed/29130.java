private void takeAShot() {
    Space space = ((Space) (getWorld()));
    Ship ship = space.getShip();
    if ((shootProgress) > 0) {
        (weaponDelay)++;
        if (((weaponDelay) % (cyclesBetweenShots)) == 0) {
            (shootProgress)--;
            shoot(playerX, playerY, currentWeapon);
        }
    }else {
        queueInUse(false);
    }
}