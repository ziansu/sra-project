@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    inventory = new com.fiuady.compustore.db.Inventory(getApplicationContext());
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_categories);
    recyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.categories_recyclerView)));
    recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    adapter = new com.fiuady.compustore.android.compustore.CategoriesActivity.ProductCategoryAdapter(inventory.getAllProductCategories());
    recyclerView.setAdapter(adapter);
}