private static double relativeInterConnectivity(java.util.List<chameleon.Node.Edge> lhsCrossedEdges, java.util.List<chameleon.Node.Edge> rhsCrossedEdges, java.util.List<chameleon.Node.Edge> allCrossedEdges) {
    double mergedEdgeCutSum = chameleon.Chameleon.totalWeightOfEdges(allCrossedEdges);
    double lhsEdgeCutSum = chameleon.Chameleon.totalWeightOfEdges(lhsCrossedEdges);
    double rhsEdgeCutSum = chameleon.Chameleon.totalWeightOfEdges(rhsCrossedEdges);
    if ((lhsEdgeCutSum + rhsEdgeCutSum) == 0) {
        return 0;
    }else {
        double result = mergedEdgeCutSum / ((lhsEdgeCutSum + rhsEdgeCutSum) / 2);
        return result;
    }
}