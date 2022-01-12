@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    android.view.View view = inflater.inflate(R.layout.fragment_sitac, container, false);
    com.google.android.gms.maps.SupportMapFragment mapFragment = ((com.google.android.gms.maps.SupportMapFragment) (getChildFragmentManager().findFragmentById(R.id.map)));
    mapFragment.getMapAsync(this);
    this.isCodis = ((edu.istic.tdf.dfclient.TdfApplication) (this.getActivity().getApplication())).loadCredentials().isCodisUser();
    return view;
}