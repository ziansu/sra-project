@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        android.util.Log.e(com.jwang.android.gymmate.fragment.media_list_fragment.MainMediaListFragment.TAG, ((("MainMediaListFragment -- requestLocationUpdates: location is " + (location.getLatitude())) + ", ") + (location.getLongitude())));
    }
    onLocationUpdated(location);
}