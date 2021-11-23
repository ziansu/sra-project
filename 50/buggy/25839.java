@java.lang.Override
public boolean canExtractItem(int slot, net.minecraft.item.ItemStack item, int side) {
    return isStackEqualToLock(item);
}