@java.lang.Override
public long onNewLocation(com.stdnull.runmap.model.TrackPoint trackPoint) {
    com.amap.api.maps.model.LatLng cur = new com.amap.api.maps.model.LatLng(trackPoint.getLatitude(), trackPoint.getLongitude());
    if (mCoordinateLists.isEmpty()) {
        mCoordinateLists.add(trackPoint);
        return 0;
    }
    com.amap.api.maps.model.LatLng pre = mCoordinateLists.get(((mCoordinateLists.size()) - 1)).getLocation();
    mCoordinateLists.add(trackPoint);
    mDurationDistance += com.amap.api.maps.AMapUtils.calculateLineDistance(pre, cur);
    return mDurationDistance;
}