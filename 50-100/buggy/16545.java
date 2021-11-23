public static net.minecraft.item.ItemStack simulateAddToOccupiedInventorySlot(net.minecraft.inventory.IInventory inventory, int slot, net.minecraft.item.ItemStack stack, net.minecraft.item.ItemStack existingStack) {
    int stackLimit = java.lang.Math.min(inventory.getInventoryStackLimit(), stack.getMaxStackSize());
    if (((stack.stackSize) + (existingStack.stackSize)) > stackLimit) {
        stack.stackSize -= stackLimit - (existingStack.stackSize);
        return stack;
    }
    return stackLimit >= (stack.stackSize) ? null : stack.splitStack(((stack.stackSize) - stackLimit));
}