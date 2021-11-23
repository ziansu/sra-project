@java.lang.Override
protected void onPostExecute(java.util.List<com.google.android.gms.maps.model.LatLng> mMapLocations) {
    super.onPostExecute(mMapLocations);
    android.database.Cursor cursor;
    initPolyline();
    for (com.google.android.gms.maps.model.LatLng mMapLocation : mMapLocations) {
        mMap.addPolyline(mPolyLineOption.add(mMapLocation));
        builder.include(mMapLocation);
    }
    com.google.android.gms.maps.model.LatLngBounds bounds = builder.build();
    progressDialog.hide();
    switch (zoomType) {
        case com.bfbstudio.routetracking.UI.MapsFragment.CURRENT_POSITION_ZOOM :
            followCurrentPosition(com.bfbstudio.routetracking.UI.MapsFragment.MAX_ZOOM);
        case com.bfbstudio.routetracking.UI.MapsFragment.FULL_LOCATION_ZOOM :
            moveCameraBounds(bounds);
    }
}