public boolean addItem(SquareInventoryItem inventoryItem) {
    if ((occupiedInventorySlots) < (maxInventorySize)) {
        if ((equippedItemIndex) != (-1)) {
            inventoryItemList.get(equippedItemIndex).unEquip();
        }
        inventoryItemList.add(inventoryItem);
        inventoryItem.pickUp(player);
        equippedItemIndex = inventoryItemList.indexOf(inventoryItem);
        return true;
    }
    return false;
}