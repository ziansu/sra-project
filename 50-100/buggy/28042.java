@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    lvItems = ((android.widget.ListView) (findViewById(R.id.lvItems)));
    readItems();
    itemsAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, items);
    lvItems.setAdapter(itemsAdapter);
    items.add("First Item");
    items.add("Second Item");
    setupListViewListener();
}