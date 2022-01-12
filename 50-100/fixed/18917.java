@java.lang.Override
public void onMapDrawFrame(com.baidu.mapapi.map.MapStatus mapStatus) {
    if ((null != (mMapView.getMap())) && (null != (mMapView.getMap().getProjection()))) {
        if (!(mBfirst)) {
            initDrawData(mapStatus);
            mBfirst = true;
        }
        draw(mapStatus);
    }
}