public void zoomInOn(@android.support.annotation.NonNull
com.google.android.gms.maps.model.LatLng latLng) {
    mIgnoreCameraZoom = false;
    com.github.dstaflund.geomemorial.common.util.CameraUpdateStrategy.zoomTo(mMap, mVisibleMarkers, latLng);
}