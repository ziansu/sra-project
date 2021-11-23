@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentLocation) != null) {
        mapView.setCenterCoordinate(new com.mapbox.mapboxsdk.geometry.LatLng(mCurrentLocation));
    }
}