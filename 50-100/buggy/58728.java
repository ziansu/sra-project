@java.lang.Override
public void recipeAddRequested(org.cook_e.data.Recipe recipe) {
    if (BuildConfig.DEBUG) {
        boolean found = false;
        for (org.cook_e.data.Recipe existingRecipe : mRecipes) {
            if (existingRecipe.equals(recipe)) {
                found = true;
            }
        }
        if (!found) {
            throw new java.lang.IllegalArgumentException("The recipe added by the user is not in the recipe list");
        }
    }
    android.util.Log.d(org.cook_e.cook_e.MealRecipeAddActivity.TAG, ("Added recipe " + recipe));
    mSelectedRecipes.add(recipe);
    updateResult();
}