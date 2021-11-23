private boolean prune(DataSet tune) {
    boolean isImproved = false;
    DecTreeNode bestInternalNode = root;
    double at = calculateAccuracy(tune);
    if (!(root.terminal)) {
        pruneOneNode(tune, root, bestInternalNode, at);
        bestInternalNode.terminal = true;
        double atn = calculateAccuracy(tune);
        if (atn > at) {
            return true;
        }else {
            bestInternalNode.terminal = false;
            return false;
        }
    }else {
        return false;
    }
}