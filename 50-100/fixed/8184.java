private java.lang.Object getCamera(com.eclipsesource.tabris.maps.MapHolderView mapHolderView) {
    com.google.android.gms.maps.model.LatLng target = getGoogleMapSafely(mapHolderView).getCameraPosition().target;
    java.util.Map<java.lang.String, java.lang.Object> camera = new java.util.HashMap<>();
    camera.put(com.eclipsesource.tabris.maps.MapPropertyHandler.PROP_POSITION, java.util.Arrays.asList(target.latitude, target.longitude));
    return camera;
}