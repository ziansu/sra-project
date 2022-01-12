@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.d(com.example.andrew.prokhor.eyecare.ui.activities.MainActivity.LOG_TAG, "onCreate()");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initAppbar();
    initCounterViews();
    initRecyclerView();
    android.content.Intent isCounterServiceAliveIntent = new android.content.Intent(com.example.andrew.prokhor.eyecare.services.CounterService.IS_ACTIVE_COUNTER_RECEIVER_ACTION);
    sendBroadcast(isCounterServiceAliveIntent);
    android.util.Log.d(com.example.andrew.prokhor.eyecare.ui.activities.MainActivity.LOG_TAG, "onCreate() end");
}