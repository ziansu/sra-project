@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_check_in);
    final android.content.Context context = this;
    new com.example.pauls.countmywork.checkIn.RetrieveFeedTask(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    android.widget.TextClock clock = ((android.widget.TextClock) (findViewById(R.id.clock1)));
}