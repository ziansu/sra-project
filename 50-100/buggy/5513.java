public static net.minecraft.item.ItemStack[][] getFullRecipeInput(net.minecraft.item.crafting.ShapelessRecipes recipe) {
    final openmods.utils.RecipeUtils.InputBuilder builder = new openmods.utils.RecipeUtils.InputBuilder(9);
    final java.util.List<net.minecraft.item.ItemStack> input = recipe.recipeItems;
    for (int i = 0; i < (recipe.getRecipeSize()); i++)
        builder.add(i, input.get(i));
    
    return builder.build();
}