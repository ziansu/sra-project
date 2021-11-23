public void setArmorClass() {
    if (ItemType.ARMOR)
        this.armorClass = (((((ItemType.ARMOR.stat) + (shield)) + (boots)) + (belt)) + (ring)) + (helmet);
    
}