@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_store);
    money = getIntent().getIntExtra("money", 0);
    example.com.virtualpet.StoreItemList storeitemlist = new example.com.virtualpet.StoreItemList(this);
    all_items = storeitemlist.getAllItems();
    listView = ((android.widget.ListView) (findViewById(R.id.listview)));
    example.com.virtualpet.CustomList adapter = new example.com.virtualpet.CustomList(this, 1, all_items);
    listView.setAdapter(adapter);
    listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
}