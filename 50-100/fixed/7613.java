@java.lang.Override
public void onCameraIdle() {
    handler.removeCallbacksAndMessages(null);
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            executeTask();
        }
    }, 500);
    bounds = map.getProjection().getVisibleRegion().latLngBounds;
    io.tjeubaoit.pokeradar.ui.MainActivity.LOGGER.debug("Camera idle");
}