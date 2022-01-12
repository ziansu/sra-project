private double relativeInterConnectivity(java.util.List<chameleonextension.Node.Edge> lhsCrossedEdges, java.util.List<chameleonextension.Node.Edge> rhsCrossedEdges, java.util.List<chameleonextension.Node.Edge> allCrossedEdges) {
    double mergedEdgeCutSum = chameleonextension.Chameleon.totalWeightOfEdges(allCrossedEdges);
    double lhsEdgeCutSum = chameleonextension.Chameleon.totalWeightOfEdges(lhsCrossedEdges);
    double rhsEdgeCutSum = chameleonextension.Chameleon.totalWeightOfEdges(rhsCrossedEdges);
    if ((lhsEdgeCutSum == 0) && (rhsEdgeCutSum == 0)) {
        return 0;
    }else {
        double result = mergedEdgeCutSum / ((lhsEdgeCutSum + rhsEdgeCutSum) / 2);
        return result;
    }
}