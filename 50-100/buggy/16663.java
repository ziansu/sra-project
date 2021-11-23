private static int addToNonEmptySlot(net.minecraft.inventory.IInventory inventory, int maxToAdd, int numberAdded, int slot) {
    net.minecraft.item.ItemStack slotStack = inventory.getStackInSlot(slot);
    int stackAddition = java.lang.Math.min(((java.lang.Math.min(slotStack.getMaxStackSize(), inventory.getInventoryStackLimit())) - (slotStack.stackSize)), (maxToAdd - numberAdded));
    slotStack.stackSize += stackAddition;
    return stackAddition;
}