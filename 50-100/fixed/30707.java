@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_recipe_list);
    butterknife.ButterKnife.bind(this);
    setupInjection();
    setupToolbar();
    setupRecyclerView();
    presenter.onCreate();
    presenter.getRecipes();
}