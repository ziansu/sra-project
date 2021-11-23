@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.tyler_000.recipeapp.Step_Activity.class);
    com.example.tyler_000.recipeapp.Recipe selectedRecipe = ((com.example.tyler_000.recipeapp.Recipe) (recipeReferenceArray.get(parent.getSelectedItemPosition())));
    intent.putExtra(com.example.tyler_000.recipeapp.RecipeSelector.EXTRA_RECIPE, selectedRecipe);
    startActivity(intent);
}