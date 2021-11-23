@java.lang.Override
public void onHostResume() {
    _paused = false;
    if ((_mapView) != null) {
        _mapView.onStart();
        _mapView.onResume();
    }
}