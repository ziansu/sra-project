static void addExtractorRecipes() {
    reborncore.api.recipe.RecipeHandler.addRecipe(new techreborn.init.ExtractorRecipe(techreborn.init.ItemParts.getPartByName("rubberSap"), techreborn.init.ItemParts.getPartByName("rubber", 3), 400, 20));
    reborncore.api.recipe.RecipeHandler.addRecipe(new techreborn.init.ExtractorRecipe(new net.minecraft.item.ItemStack(ModBlocks.rubberLog), techreborn.init.ItemParts.getPartByName("rubber"), 400, 20));
}