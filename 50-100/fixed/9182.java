@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dish_detail);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.content.Intent dishInent = getIntent();
    int dish_id = dishInent.getIntExtra("dish_id", 1);
    context = this;
    fetchDishFromServer(dish_id);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}