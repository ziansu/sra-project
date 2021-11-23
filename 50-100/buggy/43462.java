@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_check_in);
    final android.content.Context context = this;
    android.widget.TextClock clock = ((android.widget.TextClock) (findViewById(R.id.clock1)));
    new com.example.pauls.countmywork.checkIn.RetrieveFeedTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_spinner_item, spinnerArray);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    android.widget.Spinner sItems = ((android.widget.Spinner) (findViewById(R.id.spinner_task)));
    sItems.setAdapter(adapter);
}