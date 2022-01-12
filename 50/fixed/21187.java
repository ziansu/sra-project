@java.lang.Override
public net.minecraft.item.ItemStack extractItem(int slot, int amount, boolean simulate) {
    return this.getOutputInventory().extractItem(0, amount, simulate);
}