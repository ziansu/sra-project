public void onCraftMatrixChanged(net.minecraft.inventory.IInventory inv) {
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        this.te.setInventorySlotContents((i + 1), inv.getStackInSlot(i));
    }
    if ((this.craftMatrix) != null)
        this.craftResult.setInventorySlotContents(0, net.minecraft.item.crafting.CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.te.getWorldObj()));
    
}