@java.lang.Override
public void mapInitialized() {
    com.lynden.gmapsfx.javascript.object.MapOptions mapOptions = new com.lynden.gmapsfx.javascript.object.MapOptions();
    mapOptions.center(new com.lynden.gmapsfx.javascript.object.LatLong(47.6097, (-122.3331))).overviewMapControl(false).panControl(false).rotateControl(false).scaleControl(false).streetViewControl(false).zoomControl(true).zoom(16);
    map = mapView.createMap(mapOptions);
    trackLine = new com.lynden.gmapsfx.shapes.Polyline();
    map.addMapShape(trackLine);
}