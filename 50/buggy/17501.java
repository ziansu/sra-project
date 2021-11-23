public void setWeapons(java.util.List<objects.Weapon> weapons) {
    this.weapons = weapons;
    for (objects.Weapon w : this.weapons) {
        ultima.Constants.WeaponType t = w.getType();
        t.setWeapon(w);
    }
}