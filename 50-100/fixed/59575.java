@java.lang.Override
protected java.util.ArrayList<com.muyunluan.bakingapp.data.BakingRecipe> doInBackground(java.lang.Void... params) {
    try {
        java.lang.String jsonRecipeResponse = com.muyunluan.bakingapp.utils.NetworkUtils.getResponseFromHttpUrl(OpenRecipeJsonUtils.RECIPE_URL);
        com.muyunluan.bakingapp.utils.OpenRecipeJsonUtils.getRecipesFromJson(jsonRecipeResponse, mBakingRecipeData);
        return mBakingRecipeData;
    } catch (java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}