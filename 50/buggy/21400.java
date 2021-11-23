@java.lang.Override
public void goToLocation(com.teamagam.gimelgimel.app.view.viewer.data.geometries.PointGeometry pointGeometry) {
    if ((pointGeometry.altitude) == 0) {
        pointGeometry.altitude = -1;
    }
    mGGMapView.zoomTo(pointGeometry);
}