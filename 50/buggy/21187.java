@java.lang.Override
public net.minecraft.item.ItemStack extractItem(int slot, int amount, boolean simulate) {
    return slot == 1 ? this.getOutputInventory().extractItem(0, amount, simulate) : net.minecraft.item.ItemStack.EMPTY;
}