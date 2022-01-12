@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    com.google.android.gms.maps.MapFragment mapFragment = ((com.google.android.gms.maps.MapFragment) (getFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    nwhacks.tutorme.utils.GPSTracker gpsTracker = new nwhacks.tutorme.utils.GPSTracker(getApplicationContext());
    loc = gpsTracker.getLocation(getApplicationContext());
}