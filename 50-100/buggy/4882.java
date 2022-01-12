@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int slot, int amount) {
    net.minecraft.item.ItemStack stack = getStackInSlot(slot);
    if ((stack != null) && (amount != 0)) {
        if ((stack.stackSize) <= amount) {
            setInventorySlotContents(slot, null);
        }else {
            stack = stack.splitStack(amount);
            setInventorySlotContents(slot, getStackInSlot(slot));
        }
        markDirty();
        return stack;
    }
    return null;
}