@java.lang.Override
public void getIngredients(int recipeId, @android.support.annotation.NonNull
com.example.android.bakingapplication.repository.GetIngredientsCallback callback) {
    if ((cachedRecipes) != null) {
        java.util.List<com.example.android.bakingapplication.model.Ingredient> cachedIngredients = getRecipeWithId(recipeId).getIngredients();
        callback.onIngredientsLoaded(cachedIngredients);
        return ;
    }
    recipeDatabaseSource.getIngredients(recipeId, new com.example.android.bakingapplication.repository.GetIngredientsCallback() {
        @java.lang.Override
        public void onIngredientsLoaded(java.util.List<com.example.android.bakingapplication.model.Ingredient> ingredients) {
            callback.onIngredientsLoaded(ingredients);
        }

        @java.lang.Override
        public void onDataNotAvailable(java.lang.String failureMessage) {
            callback.onDataNotAvailable(failureMessage);
        }
    });
}