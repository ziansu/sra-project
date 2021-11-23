@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<java.util.List<com.example.foodnote.backend.apis.recipeApi.model.Recipe>> loader, java.util.List<com.example.foodnote.backend.apis.recipeApi.model.Recipe> data) {
    mAdapter.setRecipes(data);
    mAdapter.notifyDataSetChanged();
}