@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int index, int count) {
    net.minecraft.item.ItemStack stack = inventory.get(index);
    if (!(stack.isEmpty())) {
        if ((stack.getCount()) <= count) {
            net.minecraft.item.ItemStack result = stack;
            setInventorySlotContents(index, ItemStack.EMPTY);
            markDirty();
            return result;
        }
        net.minecraft.item.ItemStack split = stack.splitStack(count);
        markDirty();
        return split;
    }
    return net.minecraft.item.ItemStack.EMPTY;
}