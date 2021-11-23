public void addRecipes(java.util.ArrayList<edu.uw.informatics.brewsky.Recipe> recipes) {
    for (edu.uw.informatics.brewsky.Recipe each : recipes) {
        android.util.Log.i(getString(R.string.log_general), each.toString());
    }
    recipesList.addAll(recipes);
}