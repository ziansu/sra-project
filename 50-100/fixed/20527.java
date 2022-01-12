@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    forwardPort();
    invoices = new java.util.ArrayList<>();
    invoicesMap = new java.util.HashMap<>();
    adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, invoices);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.list)));
    listView.setAdapter(adapter);
}