@java.lang.Override
public double calcWeight(com.graphhopper.util.EdgeIteratorState edgeState, boolean reverse, int prevOrNextEdgeId) {
    double speed = speedProvider.calcSpeed(edgeState, reverse);
    if (speed == 0)
        return java.lang.Double.POSITIVE_INFINITY;
    
    double time = ((edgeState.getDistance()) / speed) * (com.graphhopper.routing.util.DynamicWeighting.SPEED_CONV);
    boolean penalizeEdge = edgeState.getBoolean(EdgeIteratorState.K_UNFAVORED_EDGE, reverse, false);
    if (penalizeEdge)
        time += heading_penalty;
    
    return time / (0.5 + (java.lang.Math.pow(getEdgePreference(edgeState, reverse), 2)));
}