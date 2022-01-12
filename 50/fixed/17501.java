public void init() {
    for (objects.Weapon w : this.weapons) {
        ultima.Constants.WeaponType t = w.getType();
        t.setWeapon(w);
    }
}