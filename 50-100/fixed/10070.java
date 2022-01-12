@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = getSlotFromIndex(slot, index);
    return handler.insertItem(slot, stack, simulate);
}