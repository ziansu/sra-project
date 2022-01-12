private android.content.ContentValues getRecipeContentValues(rstead.bgoff.mshultz.therecipebook.Recipe recipe) {
    android.content.ContentValues recipeValues = new android.content.ContentValues();
    recipeValues.put(NAME_COL, recipe.getName());
    recipeValues.put(IMAGE_COL, recipe.getImageLink());
    recipeValues.put(INGREDIENTS_COL, recipe.getIngredients());
    recipeValues.put(DESCRIPTION_COL, recipe.getDescription());
    recipeValues.put(NOTES_COL, recipe.getNotes());
    return recipeValues;
}