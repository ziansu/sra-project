@java.lang.Override
public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
    if (mDestroyed) {
        return ;
    }
    mCompassView.update(getDirection());
    mMyLocationView.update();
    try {
        mMapboxMap.getMarkerViewManager().update();
    } catch (java.lang.NullPointerException e) {
    }
    for (com.mapbox.mapboxsdk.annotations.InfoWindow infoWindow : mMapboxMap.getInfoWindows()) {
        infoWindow.update();
    }
}