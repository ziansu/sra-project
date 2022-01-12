@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int slot, int amount) {
    net.minecraft.item.ItemStack stack = getStackInSlot(slot);
    if (stack != null) {
        if ((stack.getCount()) > amount) {
            stack = stack.splitStack(amount);
            markDirty();
        }else {
            setInventorySlotContents(slot, ItemStack.EMPTY);
        }
    }
    return stack;
}