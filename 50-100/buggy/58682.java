public java.util.List<net.osmand.plus.TargetPointsHelper.TargetPoint> getIntermediatePointsNavigation() {
    java.util.List<net.osmand.plus.TargetPointsHelper.TargetPoint> intermediatePoints = new java.util.ArrayList<>();
    if (settings.USE_INTERMEDIATE_POINTS_NAVIGATION.get()) {
        for (net.osmand.plus.TargetPointsHelper.TargetPoint t : intermediatePoints) {
            intermediatePoints.add(t);
        }
    }
    return intermediatePoints;
}