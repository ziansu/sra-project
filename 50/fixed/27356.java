public double crossingVECumulativePunishment(PSZTGraph graph) {
    return 1.0 / (1.0 + (numberOfVerticesWithEdgesCrossings(graph)));
}