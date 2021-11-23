@java.lang.Override
protected void onStart() {
    super.onStart();
    setCenterZoom(Config.DEFAULT_FIX_LAT, Config.DEFAULT_FIX_LON, org.mixare.map.MapActivity.DEFAULT_ZOOM_LEVEL);
    createOverlay();
}