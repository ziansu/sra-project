@java.lang.Override
public boolean isItemValidForSlot(int slot, net.minecraft.item.ItemStack item) {
    return (inv.get(slot).isEmpty()) || ((inv.get(slot).isItemEqual(item)) && ((inv.get(slot).getMaxStackSize()) != (inv.get(slot).getCount())));
}