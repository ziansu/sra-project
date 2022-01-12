private void setHealth(long fps) {
    checkIfDamaged();
    health += (healthPool) / fps;
    healthPool -= (healthPool) / fps;
    if (((healthPool) - ((healthPool) / fps)) < 0) {
        healthPool = 0;
    }
    if ((health) <= 0) {
        destroy();
    }
    setSize();
}