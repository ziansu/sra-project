@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    return slot == 1 ? net.minecraft.item.ItemStack.EMPTY : this.getInputInventory().insertItem(0, stack, simulate);
}