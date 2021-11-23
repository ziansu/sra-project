public double lengthCumulativePunishment(PSZTGraph graph) {
    return 1.0 / (1.0 + (relativeErrorOfEdgeLengths(graph)));
}