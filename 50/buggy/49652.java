@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.support.v4.app.FragmentManager fm = getChildFragmentManager();
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (fm.findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
}