@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    if (intent.hasExtra(com.recipes.recipefinder.ui.views.MainActivity.EXTRA_RECIPE)) {
        com.recipes.recipefinder.model.SummaryRecipe recipe = ((com.recipes.recipefinder.model.SummaryRecipe) (intent.getExtras().getSerializable(com.recipes.recipefinder.ui.views.MainActivity.EXTRA_RECIPE)));
        showRecipeDetails(recipe);
    }
}