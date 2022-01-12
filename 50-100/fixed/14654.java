@java.lang.Override
public android.view.View onCreateView(final android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_map, container, false);
    this.inflater = inflater;
    if (v != null) {
        mapView = ((com.google.android.gms.maps.MapView) (v.findViewById(R.id.mapView)));
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
    }
    return v;
}