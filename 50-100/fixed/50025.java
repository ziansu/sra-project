public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stop_list);
    android.content.Intent intent = getIntent();
    java.util.ArrayList<java.lang.String> departures = intent.getStringArrayListExtra("departures");
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, departures);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.list_view)));
    listView.setAdapter(adapter);
}