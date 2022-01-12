@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getLayoutInflater().inflate(R.layout.activity_notification, frameLayout);
    setTitle("Notification");
    android.widget.ArrayAdapter adapter = new android.widget.ArrayAdapter(this, R.layout.activity_listview, mobileArray);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.mobile_list)));
    listView.setAdapter(adapter);
}