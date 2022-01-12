@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    android.util.Log.d(com.cookbook.fenix.cookbook.CookBOOK.TEST, "life  onSave");
    mImageDownloader.setRecipeAdapter(null);
    outState.putString("query", query);
    if ((mRecipeAdapter.getItemCount()) != 0) {
        mRecipeList = mRecipeAdapter.getData();
        outState.putParcelableArrayList(BUNDLE_RECIPE_ARRAY, mRecipeList);
    }
}