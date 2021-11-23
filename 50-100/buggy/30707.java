@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recipe_list);
    butterknife.ButterKnife.bind(this);
    setupToolbar();
    setupRecyclerView();
    setupInjection();
    presenter.onCreate();
    presenter.getRecipes();
}