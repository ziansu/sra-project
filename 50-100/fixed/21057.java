@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recipe_list);
    if (savedInstanceState == null) {
        com.udacity.rokas.cookingguide.RecipeListFragment fragment = com.udacity.rokas.cookingguide.RecipeListFragment.newInstance(new android.os.Bundle());
        getSupportFragmentManager().beginTransaction().add(R.id.recipe_list_container, fragment).commit();
    }
}