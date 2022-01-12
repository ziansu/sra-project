@java.lang.Override
public boolean canInsertItem(int slot, net.minecraft.item.ItemStack item, int side) {
    if (slot == 0) {
        return false;
    }
    return isItemValidForSlot(slot, item);
}