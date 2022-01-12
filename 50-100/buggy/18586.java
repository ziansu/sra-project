public void resetMap(android.view.View v) {
    android.widget.TextView log = ((android.widget.TextView) (findViewById(R.id.log_viewer)));
    log.append("Reset Map");
    mapView.mapCenterWithPoint(curPoint.x, curPoint.y);
    mapView.setCurrentZoom(3, curPoint.x, curPoint.y);
    mapView.refresh();
}