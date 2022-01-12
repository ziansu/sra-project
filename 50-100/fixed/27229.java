public void onCraftMatrixChanged(net.minecraft.inventory.IInventory inv) {
    if ((this.craftMatrix) != null)
        this.craftResult.setInventorySlotContents(0, net.minecraft.item.crafting.CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.te.getWorldObj()));
    
    super.onCraftMatrixChanged(inv);
}