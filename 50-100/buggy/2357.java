public void useFromInventory(models.items.TakeableItem usedItem) {
    models.EquippedItems.ArmorComponent componentType = usedItem.getComponent();
    usedItem.modifyStats(avatar);
    avatarInventory.removeItem(usedItem);
    if (usedItem.getEquippable()) {
        models.items.TakeableItem oldItem = componentType.getCurrentEquippedItem(avatar);
        if (oldItem != null) {
            oldItem.modifyStatsReverse(avatar);
            componentType.unequipComponent(avatar);
            avatarInventory.addItem(oldItem);
        }
        componentType.equipComponent(avatar, usedItem);
    }
}