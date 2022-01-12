@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLocation = com.example.shreekant.sunshine.app.Utility.getPreferredLocation(this);
    android.util.Log.v(LOG_TAG, ("onCreate() Location = " + (mLocation)));
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.example.shreekant.sunshine.app.ForecastFragment(), com.example.shreekant.sunshine.app.MainActivity.FORECASTFRAGMENT_TAG).commit();
    }
    com.example.shreekant.sunshine.app.ViewServer.get(this).addWindow(this);
}