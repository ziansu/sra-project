@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int index, int count) {
    net.minecraft.item.ItemStack stack = inventory.get(index);
    if (!(stack.isEmpty())) {
        if ((stack.getCount()) <= count) {
            setInventorySlotContents(index, ItemStack.EMPTY);
            markDirty();
            return stack;
        }
        net.minecraft.item.ItemStack split = stack.splitStack(count);
        markDirty();
        return split;
    }
    return net.minecraft.item.ItemStack.EMPTY;
}