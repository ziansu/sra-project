public static net.minecraft.item.ItemStack[][] getFullRecipeInput(net.minecraftforge.oredict.ShapelessOreRecipe recipe) {
    final java.util.List<java.lang.Object> inputs = recipe.getInput();
    final int size = inputs.size();
    openmods.utils.RecipeUtils.InputBuilder builder = new openmods.utils.RecipeUtils.InputBuilder(size);
    for (int i = 0; i < size; i++) {
        final java.lang.Object input = inputs.get(i);
        openmods.utils.RecipeUtils.addOreRecipeEntry(builder, i, input);
    }
    return builder.build();
}