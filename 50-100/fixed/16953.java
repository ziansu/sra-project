@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(mcjty.rftools.craftinggrid.IItemKey key, int amount) {
    mcjty.rftools.craftinggrid.InventoriesItemSource.ItemKey realKey = ((mcjty.rftools.craftinggrid.InventoriesItemSource.ItemKey) (key));
    net.minecraft.item.ItemStack stack = realKey.getInventory().getStackInSlot(realKey.getSlot());
    net.minecraft.item.ItemStack result = stack.splitStack(amount);
    if ((stack.stackSize) == 0) {
        realKey.getInventory().setInventorySlotContents(realKey.getSlot(), null);
    }
    return result;
}