@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_category_layout);
    mMainCategoryItem = ((com.accessbox.category.MainCategoryItem) (getIntent().getSerializableExtra("Category")));
    position = getIntent().getIntExtra("position", 0);
    setupFab();
    setUpAdapter();
}