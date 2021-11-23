@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack stack) {
    if (stack == null) {
        return false;
    }
    if (((this.temc.templateMask) == 0) || ((fi.dy.masa.enderutilities.util.InventoryUtils.areItemStacksEqual(stack, this.getStackInSlot(slot))) == true)) {
        return true;
    }
    return (((this.temc.templateMask) & (1L << slot)) == 0) || (fi.dy.masa.enderutilities.util.InventoryUtils.areItemStacksEqual(stack, this.temc.templateStacks[slot]));
}