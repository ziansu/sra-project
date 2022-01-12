private void masterCodersShoot() {
    org.academiadecodigo.codewar.Projectile currentProjectile;
    for (int j = 1; j < (chars.length); j++) {
        if ((!(isFull(masterCoderProjectiles))) && ((chars[j]) != null)) {
            currentProjectile = chars[j].shoot();
            if (currentProjectile != null) {
                storeProjectile(masterCoderProjectiles, currentProjectile);
                break;
            }
        }
    }
}