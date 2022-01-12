@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = location;
    if ((mCurrentLocation) != null) {
        btn_location.clearAnimation();
        btn_location.setBackgroundResource(R.drawable.location_success);
    }
    try {
        checkPermission(getActivity());
    } catch (goodthingmap.android.prada.lab.goodthingmap.component.PermissionException e) {
        e.printStackTrace();
    }
    lm.removeUpdates(this);
}