@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    android.view.View view = inflater.inflate(R.layout.places_overview, null);
    this.map = ((org.osmdroid.views.MapView) (view.findViewById(R.id.map)));
    map.setTileSource(TileSourceFactory.MAPNIK);
    map.setBuiltInZoomControls(true);
    map.setMultiTouchControls(true);
    return view;
}