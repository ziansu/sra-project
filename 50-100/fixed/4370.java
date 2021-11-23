@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    currentTourLines = new java.util.ArrayList<>();
    drawnToursMap = new java.util.TreeMap<>();
    markersMap = new java.util.TreeMap<>();
    previousCameraLocation = social.entourage.android.EntourageLocation.cameraPositionToLocation(null, social.entourage.android.EntourageLocation.getInstance().getLastCameraPosition());
    if ((toReturn) == null) {
        toReturn = inflater.inflate(R.layout.fragment_map, container, false);
    }
    butterknife.ButterKnife.bind(this, toReturn);
    return toReturn;
}