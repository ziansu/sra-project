public void damage(float damage, thisisxanderh.turrets.entities.Entity cause) {
    health -= damage;
    if ((health) <= 0) {
        die(cause);
    }
}