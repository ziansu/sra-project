public void setArmour(entities.Armour armour) {
    if (armour != null) {
        int value = ((entities.Armour) (armour)).getProtectionIncrease();
        armour.changeProtection(this, value);
    }
    this.armour = armour;
    if (!(this.inventory.contains(armour))) {
        this.addToInventory(armour);
    }
}