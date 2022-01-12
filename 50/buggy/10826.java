public final void setMyLocationEnabled(boolean enabled) {
    mIsMyLocationEnabled = enabled;
    toggleGps(enabled);
    updateMap(com.mapbox.mapboxgl.views.MapView.MapChange.MapChangeNullChange);
}