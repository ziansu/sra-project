@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    this.setRecipeDB(((rstead.bgoff.mshultz.therecipebook.GlobalHelper) (this.getApplication())).getRecipeDB());
    ((android.widget.LinearLayout) (findViewById(R.id.mainLayout))).removeAllViews();
    initRecipes();
}