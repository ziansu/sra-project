public boolean isDead() {
    if ((Deathrounds) >= 1) {
        dead = false;
    }
    if (((HP) <= 0) || ((effectiveHP) <= 0)) {
        dead = true;
    }
    return dead;
}