@java.lang.Override
public boolean canInsertItem(int slot, net.minecraft.item.ItemStack item, int side) {
    return isItemValidForSlot(slot, item);
}