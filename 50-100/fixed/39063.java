public static int mergeItemStackSafe(net.minecraft.inventory.IInventory inventory, int side, net.minecraft.item.ItemStack result, int start, int stop, java.util.Map<java.lang.Integer, net.minecraft.item.ItemStack> undo) {
    if (inventory instanceof net.minecraft.inventory.ISidedInventory) {
        return mcjty.container.InventoryHelper.mergeItemStackInternal(inventory, ((net.minecraft.inventory.ISidedInventory) (inventory)), side, result, start, stop, undo);
    }else {
        return mcjty.container.InventoryHelper.mergeItemStackInternal(inventory, null, side, result, start, stop, undo);
    }
}