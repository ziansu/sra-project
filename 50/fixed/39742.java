public static boolean isSlotInInventory(org.spongepowered.api.item.inventory.Slot slot, org.spongepowered.api.item.inventory.Inventory targetInventory) {
    return slot.parent().equals(targetInventory);
}