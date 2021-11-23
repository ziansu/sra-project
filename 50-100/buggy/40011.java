@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (!(isLocationServiceEnabled(this.getContext()))) {
        onResume();
    }
    android.view.View view = inflater.inflate(R.layout.fragment_map_of_events, null, false);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (this.getChildFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    return view;
}