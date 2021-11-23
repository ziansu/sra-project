@java.lang.Override
public net.minecraft.item.ItemStack extractItem(int slot, int amount, boolean simulate) {
    int index = getIndexForSlot(slot);
    net.minecraftforge.items.IItemHandlerModifiable handler = getHandlerFromIndex(index);
    slot = getSlotFromIndex(index);
    return handler.extractItem(slot, amount, simulate);
}