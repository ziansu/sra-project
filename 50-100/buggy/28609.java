@java.lang.Override
public void onClick(android.view.View v) {
    java.util.ArrayList<objects.Recipe> recipeResults = GetRecipeResults();
    android.content.Intent i = new android.content.Intent(this, activities.RecipeResultsActivity.class);
    i.putExtra("RecipeResults", recipeResults);
    i.putExtra("username", userID);
    startActivity(i);
    overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
}