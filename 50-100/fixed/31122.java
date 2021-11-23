public static boolean canStoreRemains(net.minecraft.entity.player.EntityPlayer player) {
    java.util.ArrayList<com.creativemd.littletiles.common.items.ItemTileContainer.BlockEntry> mainList = new java.util.ArrayList<com.creativemd.littletiles.common.items.ItemTileContainer.BlockEntry>();
    for (int i = 0; i < (player.inventory.getSizeInventory()); i++) {
        net.minecraft.item.ItemStack stack = player.inventory.getStackInSlot(i);
        if ((stack != null) && ((stack.getItem()) instanceof com.creativemd.littletiles.common.items.ItemTileContainer)) {
            return true;
        }
    }
    return false;
}