@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlotOnClosing(int slot) {
    net.minecraft.item.ItemStack stack = getStackInSlot(slot);
    if (stack != null) {
        setInventorySlotContents(slot, null);
    }
    return stack;
}