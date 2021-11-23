public double crossingVECumulativePunishment(PSZTGraph graph) {
    return java.lang.Math.exp((-(numberOfVerticesWithEdgesCrossings(graph))));
}