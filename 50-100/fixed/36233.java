@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    rootview = inflater.inflate(R.layout.menu1_layout, container, false);
    android.location.LocationManager lm = ((android.location.LocationManager) (this.getActivity().getSystemService(Context.LOCATION_SERVICE)));
    lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    this.onLocationChanged(null);
    return rootview;
}