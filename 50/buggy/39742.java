public static boolean isSlotInInventory(org.spongepowered.api.item.inventory.Slot slot, org.spongepowered.api.item.inventory.Inventory targetInventory) {
    org.spongepowered.api.item.inventory.Inventory parent = slot.parent();
    return (parent.equals(targetInventory)) || (parent.equals(targetInventory.first()));
}