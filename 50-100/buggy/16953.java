@java.lang.Override
public void decrStackSize(mcjty.rftools.craftinggrid.IItemKey key, int amount) {
    mcjty.rftools.craftinggrid.InventoriesItemSource.ItemKey realKey = ((mcjty.rftools.craftinggrid.InventoriesItemSource.ItemKey) (key));
    net.minecraft.item.ItemStack stack = realKey.getInventory().getStackInSlot(realKey.getSlot());
    stack.splitStack(amount);
    if ((stack.stackSize) == 0) {
        realKey.getInventory().setInventorySlotContents(realKey.getSlot(), null);
    }
}