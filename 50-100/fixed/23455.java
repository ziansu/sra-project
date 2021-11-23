@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_history_view);
    android.support.v7.widget.Toolbar myToolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.my_toolbar)));
    setSupportActionBar(myToolbar);
    lvItems = ((android.widget.ListView) (findViewById(R.id.lvItems)));
    items = new java.util.ArrayList<java.lang.String>();
    readItems();
    itemsAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_list_item_1, items);
    lvItems.setAdapter(itemsAdapter);
    setupListViewListener();
    addHistory();
}