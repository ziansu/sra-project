public static net.minecraft.item.ItemStack[][] getFullRecipeInput(net.minecraft.item.crafting.ShapelessRecipes recipe) {
    final openmods.utils.RecipeUtils.InputBuilder builder = new openmods.utils.RecipeUtils.InputBuilder();
    final java.util.List<net.minecraft.item.ItemStack> input = recipe.recipeItems;
    final int size = recipe.getRecipeSize();
    for (int i = 0; i < size; i++)
        builder.add(i, input.get(i));
    
    return builder.build(size);
}