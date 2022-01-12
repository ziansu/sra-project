protected double calculateNodeNameCost(partial.code.grapa.delta.graph.DeltaNode leftNode, partial.code.grapa.delta.graph.DeltaNode rightNode) {
    double distance = 0;
    if ((mode) == (partial.code.grapa.delta.graph.GraphComparator.CONCRETE)) {
        stringComparator.getUnNormalisedSimilarity(leftNode.getComparedLabel(), rightNode.getComparedLabel());
    }else
        if ((mode) == (partial.code.grapa.delta.graph.GraphComparator.ABSTRACT)) {
            stringComparator.getUnNormalisedSimilarity(leftNode.getKind(), rightNode.getKind());
        }
    
    return distance;
}