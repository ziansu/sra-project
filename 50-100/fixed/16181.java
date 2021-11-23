public void setWeaponSelected(int weaponSelected) {
    if ((inventory.getEquippedWeapons()[this.weaponSelected]) != null)
        inventory.getEquippedWeapons()[this.weaponSelected].setBorder(javax.swing.BorderFactory.createEmptyBorder());
    
    inventory.getEquippedWeapons()[weaponSelected].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
    output.println(("W" + weaponSelected));
    output.flush();
    this.weaponSelected = weaponSelected;
}