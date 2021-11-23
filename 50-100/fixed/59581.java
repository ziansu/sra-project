@java.lang.Override
public boolean isItemValidForSlot(int index, net.minecraft.item.ItemStack stack) {
    if (index >= (slotsInput)) {
        return false;
    }
    if ((inventory[index]) != null) {
        if (((inventory[index].getItem()) == (stack.getItem())) && ((inventory[index].stackSize) < (inventory[index].getMaxStackSize()))) {
            return true;
        }
        return false;
    }
    return true;
}