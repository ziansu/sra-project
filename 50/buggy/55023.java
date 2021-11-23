@java.lang.Override
public void removeOverlay(android.view.ViewGroup sceneRoot, android.view.View overlayView) {
    android.transitions.everywhere.utils.ViewOverlayPreJellybean viewOverlay = android.transitions.everywhere.utils.ViewOverlayPreJellybean.getOverlay(sceneRoot);
    viewOverlay.removeView(overlayView);
}