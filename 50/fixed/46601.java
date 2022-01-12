public void hurt(int damage) {
    health -= damage;
    if ((health) < 0) {
        health = 0;
    }
    healthChange = -damage;
    showHealthChange = p.millis();
}