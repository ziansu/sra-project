@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setTitle("Settings");
    com.iot.unb.SmartMetering.SettingsActivity.context = getBaseContext();
    new com.iot.unb.SmartMetering.GPSTracker(this);
    new com.iot.unb.model.service.SignalLevel(this);
    new com.iot.unb.model.service.BatteryInfo(this);
}