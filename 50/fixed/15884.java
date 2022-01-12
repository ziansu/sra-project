public void move(int direction, int delta) {
    position[1] += (speed) * delta;
    Weapon.cooldown -= delta;
}