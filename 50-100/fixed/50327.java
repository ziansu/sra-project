public boolean unequipItem(items.Item item) {
    if ((item != null) && ((this.getInventory().size()) < (this.getMaximumItemsInventory()))) {
        if (item instanceof items.wereables.WereableArmor) {
            return this.unEquipArmor(((items.wereables.WereableArmor) (item)));
        }else
            if (item instanceof items.wereables.WereableWeapon) {
                return this.unEquipWeapon(((items.wereables.WereableWeapon) (item)));
            }
        
    }
    return false;
}