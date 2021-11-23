@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.example.olymbeastmk2.ucdetailedmaps.MapsActivity.PACKAGE_NAME = this.getPackageName();
    setContentView(R.layout.activity_maps);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getSupportFragmentManager().findFragmentById(R.id.map)));
    mFusedLocationClient = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(this);
    InitializeDrawer();
    startLocationUpdates();
    mapFragment.getMapAsync(this);
}