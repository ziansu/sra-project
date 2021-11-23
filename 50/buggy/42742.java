@java.lang.Override
public void onPause() {
    mapView.onPause();
    super.onPause();
    cp = googleMap.getCameraPosition();
    writeHoleLocationToFile();
}