protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d(LOG_TAG, ("InOnCreate savedInstanceState = " + savedInstanceState));
    setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    verifyPermissions();
    setupCalendar();
    com.labs.tim_barrett.weathertracker.MainActivity.CollectBroadcastReceiver broadRev = new com.labs.tim_barrett.weathertracker.MainActivity.CollectBroadcastReceiver(this);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadRev, new android.content.IntentFilter(Constants.BROADCAST_LOCATION_ACTION));
}