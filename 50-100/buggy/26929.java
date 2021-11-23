private void initPerfVariables(double v_scalingParam, double maxM) {
    this.v_scalingParam = v_scalingParam;
    adjMatrix = network.getMatrix();
    if ((VOSClusteringTechnique.level) == 0) {
        this.M = maxM;
        network.adjustEdgeWeights(VOSClusteringTechnique.M);
    }else {
        this.M = setMtoMax(VOSClusteringTechnique.M);
    }
    denominator = ((double) (network.nPossibleEdges())) * (VOSClusteringTechnique.M);
}