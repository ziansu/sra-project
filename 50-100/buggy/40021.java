public java.util.List<net.osmand.plus.TargetPointsHelper.TargetPoint> getIntermediatePointsWithTarget() {
    java.util.List<net.osmand.plus.TargetPointsHelper.TargetPoint> res = new java.util.ArrayList<net.osmand.plus.TargetPointsHelper.TargetPoint>();
    res.addAll(intermediatePoints);
    if ((pointToNavigate) != null) {
        res.add(pointToNavigate);
    }
    return res;
}