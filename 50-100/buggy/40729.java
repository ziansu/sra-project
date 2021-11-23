@java.lang.Override
public void resetRecipes() {
    CraftingManager.recipes = new org.bukkit.craftbukkit.RegistryMaterials();
    org.bukkit.craftbukkit.CraftingManager.init();
    org.bukkit.craftbukkit.RecipesFurnace.getInstance().recipes = new org.bukkit.craftbukkit.RecipesFurnace().recipes;
    org.bukkit.craftbukkit.RecipesFurnace.getInstance().customRecipes.clear();
    org.bukkit.craftbukkit.RecipesFurnace.getInstance().customExperience.clear();
}