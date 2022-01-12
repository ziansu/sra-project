@java.lang.Override
public void register(@com.sun.istack.internal.NotNull
com.lazerzes.anvils.intergration.jei.IModRegistry registry) {
    mezz.jei.api.ingredients.IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
    com.lazerzes.anvils.intergration.jei.IJeiHelpers jeiHelpers = registry.getJeiHelpers();
    java.util.ArrayList<com.lazerzes.anvils.api.AnvilRecipe> internal = com.lazerzes.anvils.api.AnvilRecipes.getRecipes();
    for (com.lazerzes.anvils.api.AnvilRecipe rec : internal) {
        if (rec.showRecipe) {
            registry.addAnvilRecipe(rec.left, java.util.Collections.singletonList(rec.right), java.util.Collections.singletonList(rec.output));
        }
    }
}