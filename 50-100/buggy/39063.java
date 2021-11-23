public static int mergeItemStackSafe(net.minecraft.inventory.IInventory inventory, int side, net.minecraft.item.ItemStack result, int start, int stop, java.util.Map<java.lang.Integer, net.minecraft.item.ItemStack> undo) {
    return mcjty.container.InventoryHelper.mergeItemStackInternal(inventory, ((net.minecraft.inventory.ISidedInventory) (inventory)), side, result, start, stop, undo);
}