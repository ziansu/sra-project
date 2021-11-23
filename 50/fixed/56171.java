public void initializeMapWithSavedValue() {
    if ((com.wafflestudio.shafe.MapManager.mapView) == null) {
        return ;
    }
    com.wafflestudio.shafe.MapManager.mapView.setMapCenterPointAndZoomLevel(com.wafflestudio.shafe.MapManager.mapCenterPoint, com.wafflestudio.shafe.MapManager.zoomLevel, false);
}