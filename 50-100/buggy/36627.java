@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.map_fragment);
    fragmentManager = getSupportFragmentManager();
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (fragmentManager.findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    lat = getIntent().getDoubleExtra("lat", 0);
    lng = getIntent().getDoubleExtra("lng", 0);
}