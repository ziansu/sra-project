@java.lang.Override
public void onLocationChanged(at.acid.conquer.Location location) {
    if (((mClient) != null) && (location.getProvider().equals(LocationManager.GPS_PROVIDER))) {
        mClient.get().onLocationUpdate(location);
    }
    if (((mClient) != null) && (location.getProvider().equals("fused"))) {
        mClient.get().onLocationUpdate(location);
    }
}