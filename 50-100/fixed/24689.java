@java.lang.Override
public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
    if (mDestroyed) {
        return ;
    }
    mCompassView.update(getDirection());
    mMyLocationView.update();
    mMapboxMap.getMarkerViewManager().update();
    for (com.mapbox.mapboxsdk.annotations.InfoWindow infoWindow : mMapboxMap.getInfoWindows()) {
        infoWindow.update();
    }
}