public void addPOIItems(net.daum.mf.map.api.MapPOIItem[] poiItems) {
    if ((com.wafflestudio.shafe.MapManager.mapView) == null) {
        return ;
    }
    com.wafflestudio.shafe.MapManager.mapView.addPOIItems(poiItems);
}