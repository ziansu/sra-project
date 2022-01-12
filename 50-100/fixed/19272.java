private DecTreeNode pruneOneNode(DataSet tune, DecTreeNode internalNode, DecTreeNode bestInternalNode, double bestAccuracy) {
    internalNode.terminal = true;
    if ((calculateAccuracy(tune)) > bestAccuracy) {
        bestInternalNode = internalNode;
        bestAccuracy = calculateAccuracy(tune);
    }
    internalNode.terminal = false;
    for (DecTreeNode child : internalNode.children) {
        if (!(child.terminal)) {
            pruneOneNode(tune, child, bestInternalNode, bestAccuracy);
        }
    }
    return bestInternalNode;
}