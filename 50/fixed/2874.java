@java.lang.Override
public void onHostPause() {
    _paused = true;
    if ((_mapView) != null) {
        _mapView.onPause();
        _mapView.onStop();
    }
}