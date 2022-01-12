@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getChildFragmentManager().findFragmentById(R.id.map)));
    googleMapHelper = new com.gca.red.redplace.helpers.GoogleMapHelper(getChildFragmentManager(), getActivity(), getContext(), mapFragment, this);
    return inflater.inflate(R.layout.maps, container, false);
}