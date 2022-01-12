@java.lang.Override
public void onSingleTapUp(android.view.MotionEvent event) {
    if ((!(isVisible())) || (mIsLocked))
        return ;
    
    mMapPoint = mMapViewOverlays.getMap().screenToMap(new com.nextgis.maplib.datasource.GeoPoint(event.getX(), event.getY()));
    mMapPoint.setCRS(GeoConstants.CRS_WEB_MERCATOR);
    mMapPoint.project(GeoConstants.CRS_WGS84);
    mOverlayPoint.setCoordinates(mMapPoint);
    mMapViewOverlays.invalidate();
}