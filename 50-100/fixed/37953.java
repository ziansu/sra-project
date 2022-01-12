@java.lang.Override
public void onCraftMatrixChanged(net.minecraft.inventory.IInventory inventory) {
    if (inventory != null)
        tileEntity.setInventorySlotContents(10, com.auramcraft.item.crafting.AuramcraftCraftingManager.getInstance().findMatchingRecipe(((com.auramcraft.inventory.InfusionCrafting) (inventory)), worldObj));
    else
        tileEntity.setInventorySlotContents(10, com.auramcraft.item.crafting.AuramcraftCraftingManager.getInstance().findMatchingRecipe(matrix, worldObj));
    
}