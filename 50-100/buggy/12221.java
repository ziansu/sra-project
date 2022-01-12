public void update() {
    if ((hp) < (maxHP)) {
        hp += hpRegin;
    }
    if ((hp) > (maxHP)) {
        hp = maxHP;
    }
    if ((stamina) < (maxStam)) {
        stamina += stamRegin;
    }
    if ((stamina) > (maxStam)) {
        stamina = maxStam;
    }
}