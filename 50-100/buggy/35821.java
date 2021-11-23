public static net.minecraft.item.crafting.IRecipe addShapedRecipe(@javax.annotation.Nonnull
net.minecraft.item.ItemStack output, java.lang.Object... recipeComponents) {
    if (com.lothrazar.cyclicmagic.registry.RecipeRegistry.WRITE_JSON) {
        com.lothrazar.cyclicmagic.registry.RecipeFileWriter.addShapedRecipe(output, recipeComponents);
    }
    for (java.lang.Object object : recipeComponents) {
        if (object instanceof java.lang.String) {
            return com.lothrazar.cyclicmagic.registry.RecipeRegistry.addShapedOreRecipe(output, recipeComponents);
        }
    }
    return net.minecraftforge.fml.common.registry.GameRegistry.addShapedRecipe(output, recipeComponents);
}