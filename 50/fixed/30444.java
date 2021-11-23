@java.lang.Override
public net.minecraft.item.ItemStack insertItem(int slot, net.minecraft.item.ItemStack stack, boolean simulate) {
    return this.getInputInventory().insertItem(0, stack, simulate);
}