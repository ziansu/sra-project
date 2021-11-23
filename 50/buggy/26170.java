@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.worlds.prudnikoff.worlds.MainActivity.categoriesData = new com.worlds.prudnikoff.worlds.CategoriesData();
    setContentView(R.layout.main_activity);
    setUpActions();
}