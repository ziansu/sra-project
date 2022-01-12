@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack item) {
    return ((inv[slot]) == null) || ((inv[slot].isItemEqual(item)) && ((inv[slot].getMaxStackSize()) != (inv[slot].getCount())));
}