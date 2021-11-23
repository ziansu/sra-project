@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.sample_contacts_activity);
    adapter = new com.example.picasso.SampleContactsAdapter(this);
    android.widget.ListView lv = ((android.widget.ListView) (findViewById(android.R.id.list)));
    lv.setAdapter(adapter);
    lv.setOnScrollListener(new com.example.picasso.SampleScrollListener(this));
    initLoader();
}