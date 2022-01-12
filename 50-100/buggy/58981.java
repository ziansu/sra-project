@javax.annotation.Nonnull
public static net.minecraft.item.ItemStack findMatchingRecipe(net.minecraft.inventory.InventoryCrafting inv) {
    net.minecraft.item.crafting.IRecipe recipe;
    for (int i = 0; i < (net.minecraft.item.crafting.CraftingManager.getInstance().getRecipeList().size()); i++) {
        recipe = net.minecraft.item.crafting.CraftingManager.getInstance().getRecipeList().get(i);
        if (recipe.matches(inv, null)) {
            return recipe.getCraftingResult(inv);
        }
    }
    return net.minecraft.item.ItemStack.EMPTY;
}