public bool addToInventory(Item item) {
    if ((getInventoryFree()) < 1) {
        return false;
    }
    inventoryItems.add(item);
    return true;
}