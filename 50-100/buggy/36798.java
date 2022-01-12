public boolean addItem(SquareInventoryItem inventoryItem) {
    java.lang.System.out.println("in addItem");
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