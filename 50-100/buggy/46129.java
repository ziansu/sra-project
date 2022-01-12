public void loadRecipe(recipe.core.Recipe recipe) {
    try {
        recipe.Ingredients = recipe.db.RecipeDB.getInstance().getIngredients(recipe.ID);
        recipe.Steps = recipe.db.RecipeDB.getInstance().getSteps(recipe.ID);
        loadRecipeUI(recipe);
        loadRecipeSpeech(recipe);
        recipeMode = true;
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
    }
}