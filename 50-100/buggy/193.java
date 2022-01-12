@java.lang.Override
public void initAndValidate() throws java.lang.Exception {
    tree = ((beast.evolution.tree.Tree) (treeInput.get()));
    data = ((snap.Data) (dataInput.get()));
    patternLogLikelihoods = new double[data.getPatternCount()];
    coalescenceRate = coalescenceRateInput.get();
    nPoints = 50;
    int nNodes = tree.getNodeCount();
    partialIntegral = new double[nPoints][nNodes];
    hasDirt = beast.evolution.tree.Tree.IS_FILTHY;
}