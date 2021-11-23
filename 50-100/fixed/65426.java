private void dispatchClickEventToMarker(java.lang.String markerID, double x, double y) {
    if (org.wwarn.mapcore.client.utils.StringUtils.isEmpty(markerID)) {
        throw new java.lang.IllegalArgumentException("markerID was empty");
    }
    for (org.wwarn.mapcore.client.components.customwidgets.map.GenericMarker marker : markers) {
        org.wwarn.mapcore.client.components.customwidgets.map.OfflineMapMarker offlineMapMarker = ((org.wwarn.mapcore.client.components.customwidgets.map.OfflineMapMarker) (marker));
        if (offlineMapMarker.getMarkerID().equals(markerID)) {
            offlineMapMarker.fireClickEvent(x, y);
        }
    }
}