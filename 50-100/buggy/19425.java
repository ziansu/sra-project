@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN_MR1)
@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    com.google.android.gms.maps.MapFragment fragment = ((com.google.android.gms.maps.MapFragment) (getChildFragmentManager().findFragmentById(R.id.map)));
    fragment.getMapAsync(this);
    trackGPS.canGetLocation();
    trackGPS.getLat1();
    trackGPS.getLong1();
    trackGPS.onLocationChanged(trackGPS.loc);
}