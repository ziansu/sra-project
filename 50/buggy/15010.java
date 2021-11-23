public boolean isDead() {
    return ((getMaxHealth()) - (getHealth())) <= 0;
}