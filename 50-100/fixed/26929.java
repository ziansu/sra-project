private void initPerfVariables(double v_scalingParam, double maxM) {
    this.v_scalingParam = v_scalingParam;
    adjMatrix = network.getMatrix();
    if ((VOSClusteringTechnique.level) == 0) {
        this.M = maxM;
        network.adjustEdgeWeights(M);
    }else {
        this.M = setMtoMax(maxM);
    }
    denominator = ((double) (network.nPossibleEdges())) * (M);
}