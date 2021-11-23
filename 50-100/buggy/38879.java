@java.lang.Override
public void onLocationChanged(at.acid.conquer.Location location) {
    android.util.Log.d(at.acid.conquer.LocationService.TAG, "onLocationChanged()");
    if (((mClient) != null) && ((location.getProvider()) == (LocationManager.GPS_PROVIDER))) {
        mClient.get().onLocationUpdate(location);
    }
    if (((mClient) != null) && (location.getProvider().equals("fused"))) {
        mClient.get().onLocationUpdate(location);
    }
}