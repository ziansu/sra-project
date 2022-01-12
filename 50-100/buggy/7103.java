public void onCraftMatrixChanged(net.minecraft.inventory.IInventory inv) {
    for (int i = 0; i < (inv.getSizeInventory()); i++) {
        this.te.setStackInSlot(inv.getStackInSlot(i), i);
    }
    this.craftResult.setInventorySlotContents(0, net.minecraft.item.crafting.CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.te.getWorldObj()));
}