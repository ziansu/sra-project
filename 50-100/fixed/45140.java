@java.lang.Override
protected void onResume() {
    super.onResume();
    checkPlayServices();
    if (getIntent().hasExtra(com.tasteofuganda.app.RecipeActivity.INTENT_SAVED_STATE_RECIPE_SELECTED_ID_KEY)) {
        android.util.Log.d(com.tasteofuganda.app.RecipeActivity.TAG, ((("intent has extra " + (com.tasteofuganda.app.RecipeActivity.INTENT_SAVED_STATE_RECIPE_SELECTED_ID_KEY)) + ", value is ") + (getIntent().getLongExtra(com.tasteofuganda.app.RecipeActivity.INTENT_SAVED_STATE_RECIPE_SELECTED_ID_KEY, 0))));
        mSelectedId = getIntent().getLongExtra(com.tasteofuganda.app.RecipeActivity.INTENT_SAVED_STATE_RECIPE_SELECTED_ID_KEY, 0);
    }
}