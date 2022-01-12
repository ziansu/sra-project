@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    location = ((android.widget.TextView) (findViewById(R.id.locationText)));
    auth.hci.adscanner.controller.GPSTracker gps = new auth.hci.adscanner.controller.GPSTracker(getBaseContext());
    if (gps.canGetLocation()) {
        location.setText(((("Langtitude: " + (gps.getLatitude())) + "\nLongtitude: ") + (gps.getLongitude())));
    }else {
        gps.showSettingsAlert();
    }
}