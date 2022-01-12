@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    inventoryStacks[slot] = stack;
    if ((stack != null) && ((stack.stackSize) > (getInventoryStackLimit()))) {
        stack.stackSize = getInventoryStackLimit();
    }
    onInventoryChanged();
}