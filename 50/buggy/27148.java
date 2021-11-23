public double lengthCumulativePunishment(PSZTGraph graph) {
    return java.lang.Math.exp(((-0.3) * (relativeErrorOfEdgeLengths(graph))));
}