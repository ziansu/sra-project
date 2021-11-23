public static void addMaceratorRecipe(net.minecraft.item.ItemStack input, net.minecraft.item.ItemStack output) {
    try {
        Recipes.macerator.addRecipe(new ic2.api.recipe.RecipeInputItemStack(input), null, output);
    } catch (java.lang.Throwable error) {
        mods.railcraft.common.util.misc.Game.logErrorAPI("IC2", error, ic2.api.recipe.Recipes.class);
    }
}