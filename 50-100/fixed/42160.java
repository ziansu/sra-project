@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.os.Bundle arg = getArguments();
    position = arg.getInt(StringUtils.PAGE_POSITION);
    if (savedInstanceState != null) {
        double[] latlng = savedInstanceState.getDoubleArray(by.org.cgm.didyoufeelit.fragments.PlaceFragment.PLACE_KEY);
        if (latlng != null)
            place = new com.google.android.gms.maps.model.LatLng(latlng[0], latlng[1]);
        
    }
    return inflater.inflate(R.layout.fragment_place, container, false);
}