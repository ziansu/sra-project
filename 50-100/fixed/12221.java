public void update() {
    if ((hp) < (maxHP)) {
        hp += hpRegin;
    }
    if ((hp) > (maxHP)) {
        hp = maxHP;
    }
    if ((hp) <= 0) {
        hp = 0;
    }
    if ((stamina) < (maxStam)) {
        stamina += stamRegin;
    }
    if ((stamina) > (maxStam)) {
        stamina = maxStam;
    }
    if ((stamina) <= 0) {
        stamina = 0;
    }
}