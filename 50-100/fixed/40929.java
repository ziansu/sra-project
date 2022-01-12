public void hit(int power) {
    int damage = power - (getDefense());
    if (shielded) {
        shielded = false;
    }else {
        if (damage > 0) {
            health -= damage;
        }
    }
    if ((health) <= 0) {
        dead = true;
        currentTile.setShip(null);
    }
}