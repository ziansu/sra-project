public void setCurrent(kien.lmbseditor.core.WeaponSet current2) {
    if ((!(this.indexToName.isEmpty())) && (current2 != null)) {
        this.listWeapon.setSelectedIndex(this.indexToName.indexOf(current2.name));
    }
}