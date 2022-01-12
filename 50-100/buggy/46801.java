@java.lang.Override
public void run() {
    java.util.List<com.google.android.gms.maps.model.LatLng> path = polyline.getPoints();
    if ((path.size()) > index) {
        path.add(index, latLng);
        polyline.setPoints(path);
        self.objects.put(propertyId, plugin.google.maps.PluginUtil.getBoundsFromPath(path));
    }
}