@java.lang.SuppressWarnings(value = "unchecked")
private static java.util.HashSet<java.lang.Integer> getPointsToSet(com.ensoftcorp.atlas.core.db.graph.Node node) {
    if (node.hasAttr(com.ensoftcorp.open.pointsto.analysis.JimplePointsTo.POINTS_TO_SET)) {
        return ((java.util.HashSet<java.lang.Integer>) (node.getAttr(com.ensoftcorp.open.pointsto.analysis.JimplePointsTo.POINTS_TO_SET)));
    }else {
        java.util.HashSet<java.lang.Integer> pointsToIds = new java.util.HashSet<java.lang.Integer>();
        node.putAttr(com.ensoftcorp.open.pointsto.analysis.JimplePointsTo.POINTS_TO_SET, pointsToIds);
        return pointsToIds;
    }
}