@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_app_map, container, false);
    locationManager = ((android.location.LocationManager) (getActivity().getSystemService(Context.LOCATION_SERVICE)));
    locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 500, 5, locationListener);
    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 500, 0, locationListener);
    return rootView;
}