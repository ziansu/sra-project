private static int addToNonEmptySlot(net.minecraft.inventory.IInventory inventory, int maxToAdd, int slot) {
    net.minecraft.item.ItemStack slotStack = inventory.getStackInSlot(slot);
    int stackAddition = java.lang.Math.min(((java.lang.Math.min(slotStack.getMaxStackSize(), inventory.getInventoryStackLimit())) - (slotStack.stackSize)), maxToAdd);
    slotStack.stackSize += stackAddition;
    return stackAddition;
}