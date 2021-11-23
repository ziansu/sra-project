private void processGroundOverlays(java.util.Map<com.google.maps.android.kml.KmlGroundOverlay, java.lang.Object> groundOverlayMap, java.util.Map<java.lang.String, java.lang.String> styleMapHash, java.util.Map<java.lang.String, com.google.maps.android.kml.KmlStyle> styleHash) {
    for (com.google.maps.android.kml.KmlGroundOverlay groundOverlay : groundOverlayMap.keySet()) {
        try {
            mil.emp3.api.interfaces.IImageLayer imageLayer = new mil.emp3.api.ImageLayer(groundOverlay.getImageUrl(), groundOverlay.getLatLngBox());
            this.imageLayerList.add(imageLayer);
        } catch (java.net.MalformedURLException e) {
            android.util.Log.e(mil.emp3.api.utils.kml.EmpKMLParser.TAG, "Failed to create ImageLayer.", e);
        }
    }
}