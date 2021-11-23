public void setMeleeWeapon(com.tda367.infinityrun.MeleeWeapon weapon) {
    if ((meleeWeapon) != null) {
        removeChildren(meleeWeapon);
    }
    addChildren(weapon);
    meleeWeapon = weapon;
}