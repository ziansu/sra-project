protected void updateCraftingGrid() {
    craftResult.setInventorySlotContents(0, net.minecraft.item.crafting.CraftingManager.getInstance().findMatchingRecipe(getCraftingGrid(), getWorldObj()));
}