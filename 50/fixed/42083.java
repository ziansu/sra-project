public void hit(int dmg) {
    int damage = dmg - (def);
    if (damage < 0) {
        damage = 0;
    }
    health -= damage;
    hurt(damage);
}