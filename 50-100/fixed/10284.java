@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup parent, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, mMapView, savedInstanceState);
    android.view.View v = inflater.inflate(R.layout.fragment_discover, parent, false);
    mMapView = ((com.google.android.gms.maps.MapView) (v.findViewById(R.id.mapview)));
    mMapView.onCreate(savedInstanceState);
    mGoogleMap = mMapView.getMap();
    mGoogleMap.getUiSettings().setMyLocationButtonEnabled(false);
    mGoogleMap.setMyLocationEnabled(true);
    return v;
}