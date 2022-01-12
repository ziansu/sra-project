@java.lang.Override
public void onMapDrawFrame(javax.microedition.khronos.opengles.GL10 gl10, com.baidu.mapapi.map.MapStatus mapStatus) {
    if ((null != (mMapView.getMap())) && (null != (mMapView.getMap().getProjection()))) {
        if (!(mBfirst)) {
            initDrawData(mapStatus);
            mBfirst = true;
        }
        draw(mapStatus);
    }
}