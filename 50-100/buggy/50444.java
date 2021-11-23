@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    lvItems = ((android.widget.ListView) (findViewById(R.id.lvItems)));
    com.codepath.smarttasker.data.ItemListDbHelper dbHelper = new com.codepath.smarttasker.data.ItemListDbHelper(this);
    items = dbHelper.getAllItems();
    itemsAdapter = new com.codepath.smarttasker.adaptors.TodoArrayAdapter(this, android.R.layout.simple_list_item_1, items);
    lvItems.setAdapter(itemsAdapter);
    setupListViewListenerForLongClick();
    setupListViewListenerForClick();
}