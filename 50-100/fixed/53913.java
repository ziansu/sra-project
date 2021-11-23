@java.lang.Override
public void onMapReady(com.mapzen.android.graphics.MapzenMap mapzenMap) {
    mapzenMap.setCameraType(CameraType.FLAT);
    mListener.mapIsReady();
    if (permissionsvalid) {
        mapzenMap.setMyLocationEnabled(true);
        enableLocationOnResume = true;
    }
    if (!((searchedLocation) == null)) {
        mapzenMap.drawSearchResult(searchedLocation);
    }
    this.map = mapzenMap;
}