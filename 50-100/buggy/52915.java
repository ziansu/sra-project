@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_transfer);
    listView = ((android.widget.ListView) (findViewById(R.id.currentItems)));
    items = new java.util.ArrayList<>();
    setTitle(savedInstanceState);
    readSavedItems();
    setListeners();
    sortList(isIncreasingOrder, currentOrder);
    customAdapter = new com.aisleshare.TransferAdapter(this, items, R.layout.row_transfer);
    listView.setAdapter(customAdapter);
}