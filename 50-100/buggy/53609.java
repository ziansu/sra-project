public java.util.List<net.osmand.data.LatLon> getIntermediatePointsLatLonNavigation() {
    java.util.List<net.osmand.data.LatLon> intermediatePointsLatLon = new java.util.ArrayList<net.osmand.data.LatLon>();
    if (settings.USE_INTERMEDIATE_POINTS_NAVIGATION.get()) {
        for (net.osmand.plus.TargetPointsHelper.TargetPoint t : intermediatePoints) {
            intermediatePointsLatLon.add(t.point);
        }
    }
    return intermediatePointsLatLon;
}