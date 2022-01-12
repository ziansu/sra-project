@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recipe);
    android.content.Intent intent = getIntent();
    int drinkNo = ((java.lang.Integer) (getIntent().getExtras().get(com.habijabi.mealplanner.RecipeActivity.EXTRA_RECIPENO)));
    new com.habijabi.mealplanner.RecipeActivity.UpdateRecipeClass().execute(drinkNo);
}