@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    mRequestingLocationUpdates = false;
    mFusedLocationClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(this);
    mSettingsClient = com.google.android.gms.location.LocationServices.getSettingsClient(this);
    createLocationRequest();
    createLocationCallback();
    buildLocationSettingsRequest();
    startUpdates();
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}