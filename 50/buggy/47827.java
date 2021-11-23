public com.github.tnerevival.core.inventory.TNEInventory getInventory(java.util.UUID player) {
    return inventories.get(getInventoryID(player));
}