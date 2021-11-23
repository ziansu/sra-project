public void saveMapCenterPointAndZoomLevel() {
    com.wafflestudio.shafe.MapManager.mapCenterPoint = com.wafflestudio.shafe.MapManager.mapView.getMapCenterPoint();
    com.wafflestudio.shafe.MapManager.zoomLevel = com.wafflestudio.shafe.MapManager.mapView.getZoomLevel();
}