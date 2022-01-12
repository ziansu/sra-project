public void hit(int power) {
    int damage = power - (getDefense());
    if (shielded) {
        shielded = false;
    }else {
        health = java.lang.Math.min(((health) - damage), maxHealth);
    }
    if ((health) <= 0) {
        dead = true;
        currentTile.setShip(null);
    }
}