public void equipItem(org.escaperun.game.model.items.equipment.weapons.WeaponItem weaponItem) {
    if (!(inventory.isFull())) {
        org.escaperun.game.model.items.equipment.EquipableItem equippedItem = equipment.equipItem(weaponItem);
        statContainer.setWeaponDamage((equippedItem != null ? equippedItem.getStatistics().getOffensiveRating().getCurrent() : 0.0));
        if (!(inventory.contains(equippedItem))) {
            inventory.add(equippedItem);
        }else {
            inventory.remove(equippedItem);
        }
    }
}