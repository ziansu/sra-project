public int getAmmo() {
    if ((stuff.getSelectedWeapon()) != null) {
        return stuff.getSelectedWeapon().getAmmo();
    }
    return 1;
}