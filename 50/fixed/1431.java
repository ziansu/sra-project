@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gps);
    android.location.LocationManager lMgr = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    lMgr.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
}