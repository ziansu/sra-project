@java.lang.Override
public void onHostResume() {
    _paused = false;
    _mapView.onStart();
    _mapView.onResume();
}