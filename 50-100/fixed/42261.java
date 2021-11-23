@java.lang.Override
public void addRecipe(java.lang.String oreInput, net.minecraft.item.ItemStack output) {
    if ((((net.minecraft.util.StringUtils.isNullOrEmpty(oreInput)) || (output == null)) || ((output.getItem()) == null)) || ((output.stackSize) <= 0)) {
        buildcraftAdditions.core.Logger.error("Tried to register invalid duster recipe! Skipping.");
        return ;
    }
    recipes.add(new buildcraftAdditions.recipe.duster.DusterRecipeOreDict(oreInput, output));
}