@java.lang.Override
public void onHostPause() {
    _paused = true;
    _mapView.onPause();
    _mapView.onStop();
}