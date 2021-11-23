@java.lang.Override
public net.minecraft.inventory.Slot getSlot(int par1) {
    if ((par1 < 0) || (par1 >= (inventorySlots.size()))) {
        return null;
    }
    return ((net.minecraft.inventory.Slot) (inventorySlots.get(par1)));
}